package com.uindata.czs.filter;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import javax.jms.ConnectionFactory;

/**
 *
 * @author ：chenzongshun
 * @date ：Created in 2019-04-04 13:38:35
 * @description：Camle路由的Filter
 *
 */
public class CamleFilter {
    public static void main(String args[]) throws Exception {
        CamelContext context = new DefaultCamelContext();
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
        context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("ftp://192.168.1.233:21/move/?username=admin&password=123456")// 轮询ftp的xxx目录下的所有文件
                        .to("jms:orders");

                from("jms:orders")
                        .filter(header("CamelFileName").isEqualTo("test.txt"))
                        .process(e -> {
                            System.out.println("我只放行了 " + e.getIn().getHeader("CamelFileName") + " 文件");
                        });
            }
        });
        context.start();
        Thread.sleep(5000);
        context.stop();
    }
}