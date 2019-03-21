package com.uindata.czs.http;
 
import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 * https://blog.csdn.net/helllochun/article/details/80975303
 */
public class HttpRemoteRequest extends RouteBuilder {
 
    public static void main(String[] args)  {
        try {
            // 这是camel上下文对象，整个路由的驱动全靠它了。
            ModelCamelContext camelContext = new DefaultCamelContext();
            // 启动route
            camelContext.start();
            // 将我们编排的一个完整消息路由过程，加入到上下文中
            camelContext.addRoutes(new HttpRemoteRequest());
 
            // 通用没有具体业务意义的代码，只是为了保证主线程不退出
            synchronized (HttpRemoteRequest.class) {
                HttpRemoteRequest.class.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("FirstTest exception "+e.getMessage());
        }
    }
 
    public void configure() throws Exception {
        from("netty-http:http://127.0.0.1:8282/http").to("direct:getContact");
//        from("direct:getContact").to("http://mobsec-dianhua.baidu.com/dianhua_api/open/location?tel=17001111234&parameters&bridgeEndpoint=true");// 手机号码归属地成功
        from("direct:getContact").to("http://www.baidu.com?&parameters&bridgeEndpoint=true")
        ;// 百度成功
    }
}