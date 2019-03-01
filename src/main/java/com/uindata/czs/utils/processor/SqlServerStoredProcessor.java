package com.uindata.czs.utils.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static com.uindata.czs.database.sqlserver.timer.SqlServerStoredInsert.strTo16;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/27 17:53
 * @description：
 * @modified By：
 */
public class SqlServerStoredProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Map<String, Object> headers = new HashMap<>();
        headers.put("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        headers.put("datetime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        headers.put("double", new Random().nextDouble());
        headers.put("numeric", new Random().nextInt());
        headers.put("binary", strTo16("信息发送到当地司法所算法"));
        headers.put("text", "text");
        exchange.getOut().setBody(headers);
    }
}