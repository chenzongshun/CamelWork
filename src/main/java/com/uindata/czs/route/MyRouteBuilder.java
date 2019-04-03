package com.uindata.czs.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

public class MyRouteBuilder {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext();
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {

            }
        });
    }
}