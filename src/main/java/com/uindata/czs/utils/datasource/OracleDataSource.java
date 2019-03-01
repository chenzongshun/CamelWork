package com.uindata.czs.utils.datasource;

import org.apache.camel.impl.SimpleRegistry;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author ：chenzongshun
 * @date ：Created in 2019/2/27 17:10
 * @description：
 * @modified By：
 */
public class OracleDataSource {

    /**
     * 获得一个已经put了数据源的SimpleRegistry
     * @return
     */
    public static SimpleRegistry getSimpleRegistry(){
        // 创建数据源
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("oracle.jdbc.OracleDriver");
        basicDataSource.setUsername("UUM_test");
        basicDataSource.setPassword("ghc_211!");
        basicDataSource.setUrl("jdbc:oracle:thin:@//192.168.1.101:1521/orcl");

        SimpleRegistry simpleregistry = new SimpleRegistry();
        simpleregistry.put("DataSource", basicDataSource);
        return simpleregistry;
    }

}