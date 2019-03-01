package com.uindata.czs.utils.processor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import sun.misc.BASE64Encoder;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/27 17:53
 * @description：
 * @modified By：
 */
public class OracleSearch1Processor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        JSONArray jsonArray = new JSONArray();
        BASE64Encoder encoder = new BASE64Encoder();
        ArrayList arrayList = (ArrayList) exchange.getIn().getBody();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                byte[] bytes = (byte[]) ((LinkedHashMap) arrayList.get(i)).get("TBLOB");
                JSONObject tblob = new JSONObject();
                tblob.put("BLOB", bytes == null ? "" : encoder.encode(bytes));
                jsonArray.add(tblob);
            }
        }
        exchange.getOut().setHeader("blobDate", jsonArray);
    }
}