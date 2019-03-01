package com.uindata.czs.utils.datasource;

import org.apache.camel.impl.SimpleRegistry;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/27 17:10
 * @description：
 * @modified By：
 */
public class MySqlDataSource {

    /**
     * 获得一个已经put了数据源的SimpleRegistry
     * @return
     */
    public static SimpleRegistry getSimpleRegistry(){
        // 创建数据源
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUsername("esb");
        basicDataSource.setPassword("esb");
        basicDataSource.setUrl("jdbc:mysql://192.168.1.103:3306/czstest");

        SimpleRegistry simpleregistry = new SimpleRegistry();
        simpleregistry.put("DataSource", basicDataSource);
        return simpleregistry;
    }

}