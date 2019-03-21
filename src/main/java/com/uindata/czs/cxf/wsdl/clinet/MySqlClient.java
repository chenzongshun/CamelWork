package com.uindata.czs.cxf.wsdl.clinet;

import com.uindata.czs.utils.Variable;

        import javax.xml.namespace.QName;
        import java.net.URL;

public class MySqlClient {
    private static final QName SERVICE_NAME = new QName("http://DefaultNamespace", "MySqlGreeter");

    public static void main(String[] args) {
        start(Variable.SEARCH);
    }

    public static void start(String function) {
        URL wsdlURL = MySqlGreeter.WSDL_LOCATION;
        MySqlGreeter ss = new MySqlGreeter(wsdlURL, SERVICE_NAME);
        MySqlGreeterPortType port = ss.getMySqlGreeterPort();
        System.out.println("operation.result=" + port.operation(function));
    }
}
