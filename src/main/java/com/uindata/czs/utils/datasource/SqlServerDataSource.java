package com.uindata.czs.utils.datasource;

import org.apache.camel.impl.SimpleRegistry;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/27 17:10
 * @description：
 * @modified By：
 */
public class SqlServerDataSource {

    /**
     * 获得一个已经put了数据源的SimpleRegistry
     * @return
     */
    public static SimpleRegistry getSimpleRegistry(){
        // 创建数据源
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        basicDataSource.setUsername("sa");
        basicDataSource.setPassword("uindata_211");
        basicDataSource.setUrl("jdbc:sqlserver://192.168.1.102:9999;DatabaseName=uindata");

        SimpleRegistry simpleregistry = new SimpleRegistry();
        simpleregistry.put("DataSource", basicDataSource);

        return simpleregistry;
    }

}