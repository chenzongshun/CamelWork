package com.uindata.czs.database.sqlserver.jetty;

import com.uindata.czs.utils.datasource.SqlServerDataSource;
import com.uindata.czs.database.mysql.timer.MySqlStoredSearch;
import com.uindata.czs.utils.processor.SqlServerStoredProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/25 14:32
 * @description：SqlServer存储过程
 * @modified By：
 */
public class SqlServerStoredInsertJetty {
    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(SqlServerDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("jetty:http://0.0.0.0:8081/SqlServerStored")
                        .process(new SqlServerStoredProcessor())
                        .to("sql-stored:insertIntoCzstesttable(" +
                                "DATE :#date, " +
                                "VARCHAR :#datetime, " +
                                "DOUBLE :#double, " +
                                "INTEGER :#numeric, " +
                                "BINARY :#binary, " +
                                "VARCHAR :#text)")
                        .process(new Processor() {
                            @Override
                            public void process(Exchange exchange) throws Exception {
                                System.out.println("\r使用存储过程插入了一条记录：");
                                System.out.println(exchange.getIn().getBody());
                            }
                        });
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (MySqlStoredSearch.class) {
            MySqlStoredSearch.class.wait();
        }
    }

    /**
     * 字符串转化成为16进制字符串
     *
     * @param s
     * @return
     */
    public static String strTo16(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }


}