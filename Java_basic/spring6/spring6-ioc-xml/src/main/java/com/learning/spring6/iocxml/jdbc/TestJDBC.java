package com.learning.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  18:27
 */
public class TestJDBC {

    @Test
    public void demo1(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
    }

    @Test
    public void demo2(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource bean = applicationContext.getBean(DruidDataSource.class);
        System.out.println(bean);
        System.out.println(bean.getUrl());
    }
}
