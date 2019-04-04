package com.uindata.czs.multicast;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import javax.jms.ConnectionFactory;
import java.util.concurrent.Executors;

/**
 *
 * @author ：chenzongshun
 * @date ：Created in 2019-04-04 13:57:11
 * @description：Camle路由的多路广播，建议目录下只有一个文件以展示效果</br>
 * 将会发送到两个process里面去处理
 *
 */
public class Multicast {
    public static void main(String args[]) throws Exception {
        CamelContext context = new DefaultCamelContext();
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
        context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("ftp://192.168.1.233:21/move/?username=admin&password=123456")// 轮询ftp的xxx目录下的所有文件
                        .to("jms:orders")
                ;

                from("jms:orders")
                        .multicast()
                        .parallelProcessing() // 就像java中的多线程一样，同时执行，不加则顺序执行下
                        .executorService(Executors.newFixedThreadPool(16)) // 最大线程数增加到16，以便处理更多的传入请求
                        .to("jms:one", "jms:two") // 如果上面加了parallelProcessing()将同时执行 jms，否则按照顺序
                ;

                from("jms:one").process(e -> {
                    System.out.println("process1： " + e.getIn().getHeader("CamelFileName"));
                });
                from("jms:two").process(e -> {
                    System.out.println("process2： " + e.getIn().getHeader("CamelFileName"));
                    System.exit(0);
                });
            }
        });
        context.start();
        Thread.sleep(5000);
        context.stop();
    }
}
