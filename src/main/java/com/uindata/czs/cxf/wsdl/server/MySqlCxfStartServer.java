/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.uindata.czs.cxf.wsdl.server;

import com.uindata.czs.cxf.wsdl.clinet.MySqlClient;
import com.uindata.czs.database.mysql.timer.MySqlSearch;
import com.uindata.czs.database.mysql.timer.MySqlStoredInsert;
import com.uindata.czs.utils.Variable;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.log4j.PropertyConfigurator;

/**
 * 演示Camel如何作为路由器工作的示例。这个例子展示了Camel如何通过JMS服务将SOAP客户机的HTTP请求路由到SOAP。
 * <p>
 * wsdl2java -encoding utf-8 -p com.uindata.czs.client -d C:\Users\Administrator\Desktop\CamelWork\src\main\java -all http://localhost:9001/SoapContext/SoapPort?wsdl
 */
public final class MySqlCxfStartServer {
    // private static final String ROUTER_ADDRESS = "http://localhost:{{routerPort}}/SoapContext/SoapPort";
    private static final String ROUTER_ADDRESS = "http://localhost:{{routerPort}}/MySql";
    private static final String SERVICE_CLASS = "serviceClass=" + MySqlGreeter.class.getName();
    private static final String WSDL_LOCATION = "wsdlURL=wsdl/MySqlGreeter.wsdl";
    private static final String SERVICE_NAME = "serviceName={http://DefaultNamespace}MySqlGreeter";
    private static final String SOAP_OVER_HTTP_ROUTER = "portName={http://DefaultNamespace}MySqlGreeterPort";
    private static final String ROUTER_ENDPOINT_URI = "cxf" + ":" + "//" + ROUTER_ADDRESS + "?" + SERVICE_CLASS + "&" + WSDL_LOCATION + "&" + SERVICE_NAME + "&" + SOAP_OVER_HTTP_ROUTER + "&dataFormat=POJO";

    private static void start() throws Exception {
        String log4jPath = MySqlCxfStartServer.class.getClassLoader().getResource("conf/log4j.properties").toString();
        log4jPath = log4jPath.replace("file:/", "");
        PropertyConfigurator.configure(log4jPath);
        PropertyConfigurator.configureAndWatch(log4jPath, 1000);

        System.setProperty("routerPort", "9001");
        System.setProperty("servicePort", "9003");
        CamelContext context = new DefaultCamelContext();
        PropertiesComponent pc = new PropertiesComponent();
        context.addComponent("properties", pc);
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from(ROUTER_ENDPOINT_URI)
                        .process(new Processor() {
                            public void process(Exchange exchange) throws Exception {
                                String function = exchange.getIn().getBody().toString();
                                function = function.substring(1, function.length() - 1);
                                if (function.equals(Variable.SEARCH)) {
                                    MySqlSearch.start();
                                } else if (function.equals(Variable.STORED)) {
                                    MySqlStoredInsert.start();
                                }
                            }
                        })
                        .to("log:CamelCxfExample?showExchangeId=true")
                ;
            }
        });

        String address = ROUTER_ADDRESS.replace("{{routerPort}}", System.getProperty("routerPort"));
        System.out.println("服务发布的地址 : " + address);
        context.start();

        // 直接在此调用客户端...
        System.out.println("\n\n\n即将调用客户端");
        MySqlClient.start(Variable.SEARCH);
    }

    public static void main(String args[]) throws Exception {
        start();
    }
}
