package com.uindata.czs.database.mysql.jetty;

import com.uindata.czs.utils.datasource.MySqlDataSource;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 * MySql查询
 *
 * @author ：chenzongshun
 */
public class MySqlSearchJetty {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(MySqlDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("jetty:http://0.0.0.0:8081/MySqlSearch")
                        .setBody(constant("select * from test where tnumber=-413022102"))
                        .to("jdbc:DataSource?outputType=SelectList")
//                        .to("log:result?showCaughtException=true&showOut=true")
                ;
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (MySqlSearchJetty.class) {
            MySqlSearchJetty.class.wait();
        }
    }
}