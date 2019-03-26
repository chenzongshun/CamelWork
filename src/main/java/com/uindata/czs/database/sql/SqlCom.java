package com.uindata.czs.database.sql;

import com.uindata.czs.utils.datasource.MySqlDataSource;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

/**
 *
 * @author ：chenzongshun
 * Sql组件 http://camel.apache.org/sql-component.html
 */
public class SqlCom {

    public static void main(String[] args) throws Exception {
        ModelCamelContext camelContext = new DefaultCamelContext(MySqlDataSource.getSimpleRegistry());
        camelContext.start();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                // dataSource来自上面的camelContext，实例化的时候传了一个MySql的数据源
                String sqlUrl =
                        "sql:" +
                                "select * from test " +
                                "where tdatetime=:#tdatetime " +// 下面会在Header里面设置tdatetime
                                "and tdate=:#${property.tdate}" +// 下面会在Properteis里面设置tdate

                                "?dataSource=#DataSource" +
                                "&outputType=SelectOne" +
                                "&outputClass=" + SqlCom.class.getName() +
                                "&outputHeader=xxx" +// 将输出的数据放到xxx里面
                                "";
                // url在上面定义了
                from("timer://queryAward?period=10000s")
                        .setHeader("tdatetime", constant("2019-02-26 14:00:21"))// 设置sql的参数
                        .setProperty("tdate", constant("2019-02-26"))
                        .to(sqlUrl).process(exchange -> {
                            System.out.println("内容：" + exchange.getIn().getHeaders().get("xxx"));
                            System.out.println("总共数据的条数：" + exchange.getIn().getHeaders().get("CamelSqlRowCount"));
                            // System.out.println(exchange.getIn().getBody());// 上面设置了outputHeader=xxx，所以body内容为null
                        })
                        .to("log:query")
                ;
            }
        });
        // 没有具体业务意义的代码，只是为了保证主线程不退出
        synchronized (SqlCom.class) {
            SqlCom.class.wait();
        }
    }


    /**
     * 当做一个Pojo吧，可以用一下outputType=SelectOne   outputClass=SqlCom.class.getName()
     */
    private String tdate;
    private String tdatetime;
    private String tdouble;
    private String tnumber;
    private String ttimestamp;

    @Override
    public String toString() {
        return "SqlCom{" +
                "tdate='" + tdate + '\'' +
                ", tdatetime='" + tdatetime + '\'' +
                ", tdouble='" + tdouble + '\'' +
                ", tnumber='" + tnumber + '\'' +
                ", ttimestamp='" + ttimestamp + '\'' +
                '}';
    }

    public String getTdate() {
        return tdate;
    }

    public void setTdate(String tdate) {
        this.tdate = tdate;
    }

    public String getTdatetime() {
        return tdatetime;
    }

    public void setTdatetime(String tdatetime) {
        this.tdatetime = tdatetime;
    }

    public String getTdouble() {
        return tdouble;
    }

    public void setTdouble(String tdouble) {
        this.tdouble = tdouble;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    public String getTtimestamp() {
        return ttimestamp;
    }

    public void setTtimestamp(String ttimestamp) {
        this.ttimestamp = ttimestamp;
    }
}
