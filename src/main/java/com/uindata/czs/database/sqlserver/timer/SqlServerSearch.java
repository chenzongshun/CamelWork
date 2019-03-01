package com.uindata.czs.database.sqlserver.timer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.uindata.czs.utils.datasource.SqlServerDataSource;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;
import sun.misc.BASE64Encoder;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * 查询表数据
 *
 * @author ：chenzongshun
 */
public class SqlServerSearch {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(SqlServerDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
//                    JDBC组件没法使用 from端点，需要一个触发机制。比如：定时器、或者http调用触发。
                from("timer://queryAward?period=30s")
                        .setBody(constant("select * from czstesttable"))
                        .to("jdbc:DataSource?outputType=SelectList&useGetBytesForBlob=true")
                        .process(new Processor() {
                            @Override
                            public void process(Exchange exchange) throws Exception {
                                JSONArray jsonArray = new JSONArray();
                                ArrayList arrayList = (ArrayList) exchange.getIn().getBody();
                                for (Object obj : arrayList) {
                                    if (obj != null) {
                                        JSONObject jsonObject = new JSONObject();
                                        byte[] tbinary = (byte[]) (((LinkedHashMap) obj).get("tbinary"));
                                        BASE64Encoder encoder = new BASE64Encoder();
                                        jsonObject.put("DATE", ((LinkedHashMap) obj).get("tdate").toString());
                                        String datetime = ((LinkedHashMap) obj).get("tdatetime").toString();
                                        datetime = datetime.substring(0, datetime.lastIndexOf("."));
                                        jsonObject.put("DATETIME", datetime);
                                        jsonObject.put("DOUBLE", ((LinkedHashMap) obj).get("tdouble"));
                                        jsonObject.put("NUMERIC", ((LinkedHashMap) obj).get("tnumeric"));
                                        jsonObject.put("BINARY", tbinary == null ? "" : encoder.encode(tbinary));
                                        jsonObject.put("TEXT", ((LinkedHashMap) obj).get("ttext"));
                                        byte[] timestamp = (byte[]) ((LinkedHashMap) obj).get("ttimestamp");
                                        jsonObject.put("TIMESTAMP", encoder.encode(timestamp));
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
        synchronized (SqlServerSearch.class) {
            SqlServerSearch.class.wait();
        }
    }
}