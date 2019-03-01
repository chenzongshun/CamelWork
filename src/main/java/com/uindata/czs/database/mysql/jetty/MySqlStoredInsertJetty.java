package com.uindata.czs.database.mysql.jetty;

import com.uindata.czs.utils.datasource.MySqlDataSource;
import com.uindata.czs.utils.processor.MySqlStoredProcessor;
import com.uindata.czs.database.mysql.timer.MySqlStoredSearch;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/25 14:32
 * @description：存储过程插入单条数据
 * @modified By：
 * <p>
 * CREATE PROCEDURE insert_one ( IN cdate date, IN cdatetime datetime, IN cdouble DOUBLE, IN cnumber INT, IN cblob BLOB, IN clongblob LONGBLOB, IN ctimestamp TIMESTAMP)BEGIN INSERT INTO test ( tdate, tdatetime, tdouble, tnumber, tblob, tlongblob, ttimestamp )VALUES ( cdate, cdatetime, cdouble, cnumber, cblob, clongblob, ctimestamp );SELECT *FROM test where tdatetime = cdatetime;END;
 * CALL insert_one ( '2019-02-24', '2019-02-24 21:15:09', 4.4, 4, '4blob', '5longblob', SYSDATE() );
 */
public class MySqlStoredInsertJetty {
    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(MySqlDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
//                    JDBC组件没法使用 from端点，需要一个触发机制。比如：定时器、或者http调用触发。
                from("jetty:http://0.0.0.0:8081/MySqlStored")
                        .process(new MySqlStoredProcessor())
                        .to("sql-stored:insert_one(" +
                                "DATE :#date, " +
                                "VARCHAR :#datetime, " +
                                "DOUBLE :#double, " +
                                "INTEGER :#int, " +
                                "BLOB :#blob, " +
                                "VARCHAR :#longblob, " +
                                "VARCHAR :#timestamp)")
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

}