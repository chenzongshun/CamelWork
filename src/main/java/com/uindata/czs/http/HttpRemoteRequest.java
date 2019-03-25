package com.uindata.czs.http;

import com.alibaba.fastjson.JSONObject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 *
 * @author ：chenzongshun
 * 可以参考：https://blog.csdn.net/helllochun/article/details/80975303 </br>
 * 本案例需要启动Esb的服务【czsTestHttp】
 */
public class HttpRemoteRequest {

    public static void main(String[] args) {
        try {
            // 这是camel上下文对象，整个路由的驱动全靠它了。
            ModelCamelContext camelContext = new DefaultCamelContext();
            // 启动route
            camelContext.start();
            // 将我们编排的一个完整消息路由过程，加入到上下文中
            camelContext.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {

//                    from("netty-http:http://127.0.0.1:8282/http").to("direct:getContact");
//                    from("direct:getContact").to("http://mobsec-dianhua.baidu.com/dianhua_api/open/location?tel=17001111234&parameters&bridgeEndpoint=true");// Get手机号码归属地成功
//                    from("direct:getContact").to("http://www.baidu.com?&parameters&bridgeEndpoint=true")// Get百度成功

                    // 访问下面地址开始进行触发
                    String localUrl = "http://127.0.0.1:8282/http?id=6";
                    System.out.println(localUrl);
                    from("netty-http:" + localUrl).to("direct:getContact");
                    from("direct:getContact")
                            // 设置Http请求的方式
                            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                            .setProperty(Exchange.CHARSET_NAME,constant("iso-8859-1"))
                            .setProperty(Exchange.CONTENT_ENCODING,constant("iso-8859-1"))
                            // setProperty：设置各种请求头
                            .process(new Processor() {
                                @Override
                                public void process(Exchange exchange) throws Exception {
                                    try {
                                        // 从Get地址获取参数【有风险，多输后解析json会报错，如d=6&3=3】并设置
                                        String CamelHttpQuery = exchange.getIn().getHeaders().get("CamelHttpQuery").toString();
                                        CamelHttpQuery = CamelHttpQuery.replace("=", ":");
                                        JSONObject param = (JSONObject) JSONObject.parse("{" + CamelHttpQuery + "}");
                                        exchange.getOut().setBody("{'id':'" + param.get("id") + "'}");
                                    } catch (Exception e) {
                                        // 直接设置POST请求参数
                                        exchange.getOut().setBody("{'id':'8'}");
                                    }
                                }
                            })
                            // 记得先启动Esb中的服务【czsTestHttp】
                            .to("http://localhost:8080/rest/tel?bridgeEndpoint=true")
                    ;
                }
            });

            // 通用没有具体业务意义的代码，只是为了保证主线程不退出
            synchronized (HttpRemoteRequest.class) {
                HttpRemoteRequest.class.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("FirstTest exception " + e.getMessage());
        }
    }
}