package com.uindata.czs.database.oracle.timer;

import com.uindata.czs.utils.datasource.OracleDataSource;
import com.uindata.czs.utils.processor.OracleSearch1Processor;
import com.uindata.czs.utils.processor.OracleSearch2Processor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Oracle单条存储过程创建与查询
 * CREATE TABLE "TESTTABLE" ( "TNAME" VARCHAR2(20), "TDATE" DATE, "TDOUBLE" BINARY_DOUBLE, "TNUMBER" NUMBER, "TBLOB" BLOB, "TCLOB" CLOB, "TTIMESTAMP" TIMESTAMP (6) )
 * CREATE OR REPLACE PROCEDURE insert_oneto_testtable(cname VARCHAR, cdate VARCHAR, cdouble BINARY_DOUBLE, cnumber NUMBER, cblob VARCHAR, cclob VARCHAR, ctimestamp VARCHAR) AS BEGIN insert into testtable(tname, tdate, tdouble, tnumber, tblob, tclob, ttimestamp) values(cname, to_date(cdate, 'yyyy-MM-dd HH24:mi:ss'), cdouble, cnumber, rawtohex(cblob), to_clob(cclob), to_timestamp(to_date(ctimestamp, 'yyyy-mm-dd hh24:mi:ss'))); END insert_oneto_testtable;
 * declare tname varchar(40); tdate varchar(40); tdouble BINARY_DOUBLE; tnumber NUMBER; tblob varchar(40); tclob varchar(40); ttimestamp varchar(40); begin tname := 'tuuuu'; tdate := sysdate; tdouble := 3.3; tnumber := 3; tblob := 'gggggggggggg嘟嘟嘟'; tclob := 'fdsfscclob'; ttimestamp := '2019-02-25 23:07:33'; insert_oneto_testtable(tname, tdate, tdouble, tnumber, tblob, tclob, ttimestamp); END;
 *
 * @author ：chenzongshun
 */
public class OracleStoredInsert {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(OracleDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
//                    JDBC组件没法使用 from端点，需要一个触发机制。比如：定时器、或者http调用触发。
                from("timer://queryAward?period=1000s")
                        .process(new Processor() {
                            @Override
                            public void process(Exchange exchange) throws Exception {
                                Map<String, Object> headers = new HashMap<>();
                                headers.put("tvarchar", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                                headers.put("tdate", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());
                                headers.put("tbinary_double", new Random().nextDouble());
                                headers.put("tnumber", new Random().nextInt());
                                headers.put("tblob", "blob");
                                headers.put("tclob", "longblob");
                                headers.put("ttimestamp", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());
                                exchange.getOut().setBody(headers);
                            }
                        })
                        // 先用存储过程插入一条数据
                        .to("sql-stored:insert_oneto_testtable(" +
                                "VARCHAR :#tvarchar " +
                                ",VARCHAR :#tdate " +
                                ",DOUBLE :#tbinary_double " +
                                ",INTEGER :#tnumber " +
                                ",VARCHAR :#tblob " +
                                ",VARCHAR :#tclob " +
                                ",VARCHAR :#ttimestamp" +
                                ")")
                        // 查询刚刚存储过程插入进来的记录
                        .setBody(constant("select t.tblob,t.rowid,rownum from (select * from testtable t order by tdate desc) t where rownum <=1"))
                        .to("jdbc:DataSource?outputType=SelectList&useGetBytesForBlob=true")
                        .process(new OracleSearch1Processor())
                        .setBody(constant("select t.tname, t.tdate, t.tdouble, t.tnumber, t.tclob, t.ttimestamp,t.rowid,rownum from (select * from testtable t order by tdate desc) t where rownum <=1"))
                        .to("jdbc:DataSource?outputType=SelectList")
                        .process(new OracleSearch2Processor());
                ;
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (OracleStoredInsert.class) {
            OracleStoredInsert.class.wait();
        }
    }
}