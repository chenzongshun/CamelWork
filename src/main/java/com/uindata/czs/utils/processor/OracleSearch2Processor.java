package com.uindata.czs.utils.processor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import sun.misc.BASE64Encoder;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/27 17:53
 * @description：
 * @modified By：
 */
public class OracleSearch2Processor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        JSONArray jsonArray = new JSONArray();
        ArrayList arrayList = (ArrayList) exchange.getIn().getBody();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                LinkedHashMap map = (LinkedHashMap) arrayList.get(i);
                JSONObject json = new JSONObject();
                json.put("VARCHAR2", map.get("TNAME") == null ? "" : map.get("TNAME"));
                String tdate = map.get("TDATE") == null ? "" : map.get("TDATE").toString();
                json.put("DATE", tdate == "" ? "" : tdate.substring(0, tdate.length() - 2));
                json.put("BINARY_DOUBLE", map.get("TDOUBLE") == null ? "" : map.get("TDOUBLE"));
                json.put("NUMBER", map.get("TNUMBER") == null ? "" : map.get("TNUMBER"));
                json.put("CLOB", map.get("TCLOB") == null ? "" : map.get("TCLOB"));
                String ttimestamp = map.get("TTIMESTAMP") == null ? "" : map.get("TTIMESTAMP").toString();
                json.put("TIMESTAMP(6)", ttimestamp == "" ? "" : ttimestamp.substring(0, ttimestamp.length() - 2));
                jsonArray.add(json);
            }
        }
        JSONArray blobJson = (JSONArray) exchange.getIn().getHeader("blobDate");

        // 组合Json
        JSONArray result = new JSONArray();
        for (int i = 0; i < blobJson.size(); i++) {
            JSONObject t = JSON.parseObject(jsonArray.get(i).toString());
            t.put("BLOB", JSONObject.parseObject(blobJson.get(i).toString()).get("BLOB"));
            result.add(t);
        }
        System.out.println("\n刚刚使用存储过程插入到数据库的记录为：");
        for (Object obj : result) {
            System.out.println(obj);
        }
    }
}