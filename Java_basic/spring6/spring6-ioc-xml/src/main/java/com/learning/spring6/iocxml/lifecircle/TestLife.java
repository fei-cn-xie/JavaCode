package com.learning.spring6.iocxml.lifecircle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  19:02
 */
public class TestLife {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());
        applicationContext.close();
    }
}
