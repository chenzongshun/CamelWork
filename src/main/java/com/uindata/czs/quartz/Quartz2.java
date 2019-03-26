package com.uindata.czs.quartz;

import com.uindata.czs.utils.datasource.MySqlDataSource;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 *
 * @author ：chenzongshun
 * Quartz2组件 http://camel.apache.org/quartz2.html
 */
public class Quartz2 {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(MySqlDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                String quartzUrl =
                        "quartz2://quartzName?" +
//                                "cron=* * * * * ? *" +// 每秒钟
//                                "cron=47 40 11 * * ? " +
                                "trigger.repeatCount=1" +// 从0开始，0是1次，3是4次，前提是不设置cron属性表达式
                                "&trigger.repeatInterval=3s" +// 几秒重复，前提是不设置cron属性表达式并且设置了trigger.repeatCount属性
                                "" +
                                "";
                from(quartzUrl)
                        // dataSource来自上面的camelContext，实例化的时候传了一个MySql的数据
                        .to("sql:select * from test?dataSource=#DataSource").process(exchange -> {
                    System.out.println(exchange.getIn().getBody());
                })
                ;
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (Quartz2.class) {
            Quartz2.class.wait();
        }
    }
}
