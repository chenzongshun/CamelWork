package com.uindata.czs.database.mysql.timer;

import com.uindata.czs.utils.datasource.MySqlDataSource;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 单条存储过程创建与查询
 * CREATE PROCEDURE select_one (IN cdatetime datetime, IN cdate date, IN cdouble DOUBLE, IN cint INT, IN cblob BLOB, IN clongblob LONGBLOB, IN ctimestamp TIMESTAMP)BEGIN SELECT  * FROM  test WHERE  tnumber = cint AND tdate = cdate AND tdatetime = cdatetime AND tdouble = cdouble AND tblob = cblob AND tlongblob = clongblob AND ttimestamp = ctimestamp;END;
 * CALL select_one ('2019-02-24 21:15:06','2019-02-21',3.3 ,3,'1blob','12longblob','2019-02-24 21:15:06')
 *
 * @author ：chenzongshun
 */
public class MySqlStoredSearch {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(MySqlDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
//                    JDBC组件没法使用 from端点，需要一个触发机制。比如：定时器、或者http调用触发。
                from("timer://queryAward?period=100000s")
                        .process(new Processor() {
                            @Override
                            public void process(Exchange exchange) throws Exception {
                                Map<String, Object> headers = new HashMap<>();
                                headers.put("date", "2019-02-21");
                                headers.put("datetime", "2019-02-24 21:15:06");
                                headers.put("double", 3.3);
                                headers.put("int", 3);
                                headers.put("blob", "1blob");
                                headers.put("longblob", "12longblob");
                                headers.put("timestamp", "2019-02-24 21:15:06");
                                exchange.getOut().setBody(headers);
                            }
                        })
                        .to("sql-stored:select_one(" +
                                "VARCHAR :#datetime, " +
                                "DATE :#date, " +
                                "DOUBLE :#double, " +
                                "INTEGER :#int, " +
                                "BLOB :#blob, " +
                                "VARCHAR :#longblob, " +
                                "VARCHAR :#timestamp)")
                        .process(new Processor() {
                            @Override
                            public void process(Exchange exchange) throws Exception {
                                System.out.println("\r使用存储过程查询一个语句，返回的结果为：");
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
}