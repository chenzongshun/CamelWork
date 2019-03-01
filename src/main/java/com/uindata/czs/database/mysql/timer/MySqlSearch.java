package com.uindata.czs.database.mysql.timer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.uindata.czs.utils.datasource.MySqlDataSource;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;
import sun.misc.BASE64Encoder;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * MySql查询
 *
 * @author ：chenzongshun
 */
public class MySqlSearch {

    public static void main(String[] args) throws Exception {
        start();
    }

    /**
     * 开始查询
     *
     * @throws Exception
     */
    public static void start() throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(MySqlDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
//                    JDBC组件没法使用 from端点，需要一个触发机制。比如：定时器、或者http调用触发。
                from("timer://queryAward?period=30s")
                        .setBody(constant("select * from test"))
                        .to("jdbc:DataSource?outputType=SelectList").process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        JSONArray jsonArray = new JSONArray();
                        ArrayList arrayList = (ArrayList) exchange.getIn().getBody();
                        for (Object obj : arrayList) {
                            if (obj != null) {
                                JSONObject jsonObject = new JSONObject();
                                byte[] blob = (byte[]) (((LinkedHashMap) obj).get("tblob"));
                                byte[] longblob = (byte[]) (((LinkedHashMap) obj).get("tlongblob"));
                                BASE64Encoder encoder = new BASE64Encoder();
                                jsonObject.put("DATE", ((LinkedHashMap) obj).get("tdate").toString());
                                String datetime = ((LinkedHashMap) obj).get("tdatetime").toString();
                                datetime = datetime.substring(0, datetime.lastIndexOf("."));
                                jsonObject.put("DATETIME", datetime);
                                jsonObject.put("DOUBLE", ((LinkedHashMap) obj).get("tdouble"));
                                jsonObject.put("NUMBER", ((LinkedHashMap) obj).get("tnumber"));
                                jsonObject.put("BLOB", blob == null ? "" : encoder.encode(blob));
                                jsonObject.put("LONGBLOB", longblob == null ? "" : encoder.encode(longblob));
                                String timestamp = ((LinkedHashMap) obj).get("ttimestamp").toString();
                                timestamp = timestamp.substring(0, timestamp.lastIndexOf("."));
                                jsonObject.put("TIMESTAMP", timestamp);
                                jsonArray.add(jsonObject);
                            }
                        }
                        System.out.println("\n");
                        for (Object obj : jsonArray) {
                            System.out.println(JSONObject.parse(obj.toString()));
                        }
                    }
                });
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (MySqlSearch.class) {
            MySqlSearch.class.wait();
        }

    }
}