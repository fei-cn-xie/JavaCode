package com.learning.spring6.iocxml.factorybean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  19:21
 */
public class TestFactoryBean {
    @Test
    public void testFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

    }
}
