package com.uindata.czs.database.sqlserver.jetty;

import com.uindata.czs.utils.datasource.SqlServerDataSource;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 *
 * 查询表数据
 *
 * @author ：chenzongshun
 */
public class SqlServerSearchJetty {

    public static void main(String[] args) throws Exception {

        ModelCamelContext camelContext = new DefaultCamelContext(SqlServerDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
//                    JDBC组件没法使用 from端点，需要一个触发机制。比如：定时器、或者http调用触发。
                from("jetty:http://0.0.0.0:8081/SqlServerSearch")
                        .setBody(constant("select * from czstesttable"))
                        .to("jdbc:DataSource?outputType=SelectList&useGetBytesForBlob=true");
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (SqlServerSearchJetty.class) {
            SqlServerSearchJetty.class.wait();
        }
    }
}