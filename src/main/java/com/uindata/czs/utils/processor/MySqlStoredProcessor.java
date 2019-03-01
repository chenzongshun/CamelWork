package com.uindata.czs.utils.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.ProcessorBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/27 17:53
 * @description：
 * @modified By：
 */
public class MySqlStoredProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Map<String, Object> headers = new HashMap<>();
        headers.put("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        headers.put("datetime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        headers.put("double", new Random().nextDouble());
        headers.put("int", new Random().nextInt());
        headers.put("blob", "blob");
        headers.put("longblob", "longblob");
        headers.put("timestamp", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        exchange.getOut().setBody(headers);
    }
}