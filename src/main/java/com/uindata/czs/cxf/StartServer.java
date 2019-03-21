package com.uindata.czs.cxf;

import com.uindata.czs.http.HttpRemoteRequest;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

public class StartServer extends RouteBuilder {
    /**
     * <b>Called on initialization to build the routes using the fluent builder syntax.</b>
     * <p/>
     * This is a central method for RouteBuilder implementations to implement
     * the routes using the Java fluent builder syntax.
     *
     * @throws Exception can be thrown during configuration
     */
    @Override
    public void configure() throws Exception {
        CamelContext camelContext = getContext();
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8088/interface");
        cxfEndpoint.setServiceClass(StartServer.SimpleService.class);
        cxfEndpoint.setCamelContext(camelContext);
        cxfEndpoint.setDataFormat(DataFormat.POJO);
        camelContext.addEndpoint("myEndpoint", cxfEndpoint);
        from(cxfEndpoint).setBody(constant("Hi!"));
    }

    public static void main(String[] args) {
        try {
            ModelCamelContext camelContext = new DefaultCamelContext();
            camelContext.start();
            camelContext.addRoutes(new StartServer());
            synchronized (StartServer.class) {
                StartServer.class.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("FirstTest exception " + e.getMessage());
        }
    }

    /**
     * 服务
     */
    interface SimpleService{
        String helloShun(String greeting);
    }
}
