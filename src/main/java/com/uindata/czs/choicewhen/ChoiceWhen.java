package com.uindata.czs.choicewhen;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import javax.jms.ConnectionFactory;

/**
 * 相当于java当中的ifelse，条件选择进行不同的处理
 */
public class ChoiceWhen {
    public static void main(String args[]) throws Exception {
        CamelContext context = new DefaultCamelContext();
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
        context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("ftp://192.168.1.233:21/20190311/?username=admin&password=123456")// 轮询ftp的xxx目录下的所有文件
                        .choice()
                        .when(header("CamelFileName").endsWith(".sql"))
                        .to("jms:sql")// 如果是sql，则走下面的 from("jms:sql")
                        .stop()// 如果不想让sql文件继续走到下个路由就加上stop()
                        .when(header("CamelFileName").isEqualTo("0311test.txt"))
                        .to("jms:txt")// 如果是sql，则走下面的 from("jms:txt")
                        .when(header("CamelFileName").regex("^.*(sql|txt)$"))// 使用正则表达式，如果是sql或者txt文件
                        .to("jms:sqlAndTxt")
                        .otherwise()// 如果上面的条件都不满足的话，就相当于else
                        .to("jms:other")
                        .end()// 关闭选择块
                        .to("jms:continuedProcessing")
                ;
                from("jms:sql").process(e -> {
                    System.out.println("sql： " + e.getIn().getHeader("CamelFileName"));
                });
                from("jms:txt").process(e -> {
                    System.out.println("txt： " + e.getIn().getHeader("CamelFileName"));
                });
                from("jms:sqlAndTxt").process(e -> {
                    System.out.println("sqlAndTxt： " + e.getIn().getHeader("CamelFileName"));
                });
                from("jms:other").process(e -> {
                    System.out.println("orhter： " + e.getIn().getHeader("CamelFileName"));
                });
                from("jms:continuedProcessing").process(e -> {
                    System.err.println("continuedProcessing： " + e.getIn().getHeader("CamelFileName"));
                });
            }
        });
        context.start();
        Thread.sleep(5000);
        context.stop();
    }
}