package com.uindata.czs.ahc;

import com.uindata.czs.utils.datasource.MySqlDataSource;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.DeadLetterChannelBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 *
 * @author ：chenzongshun
 * 异步Http客户端（AHC）组件  http://camel.apache.org/ahc.html
 */
public class AhcCom {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(MySqlDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                String localUrl = "http://127.0.0.1:8282";
                System.out.println(localUrl);
                from("netty-http:" + localUrl)
                        .process(exchange -> {
                            System.out.println("netty");
                        })
                        .to("ahc://http://www.google.com") .to("mock:results")
                        .process(exchange -> {
                            System.out.println("ahc");
                        })
                ;


            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (AhcCom.class) {
            AhcCom.class.wait();
        }
    }

}
