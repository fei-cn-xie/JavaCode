package com.learning.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  19:18
 */
public class MyFactoryBean implements FactoryBean<User> {


    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
