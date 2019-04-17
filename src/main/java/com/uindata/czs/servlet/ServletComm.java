package com.uindata.czs.servlet;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019-04-08 17:01:49
 * @description：Servlet组件
 */
public class ServletComm {
    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext();
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                String servletUrl =
                        "servlet://myServlet?" +
                                "" +
                                "";
                from(servletUrl) .process(exchange -> {
                    System.out.println(exchange.getIn().getBody());
                })
                ;
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (ServletComm.class) {
            ServletComm.class.wait();
        }


    }
}
