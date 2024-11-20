package com.learning.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fei
 * @version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        // 获取bean
        //1. 根据id获取
        User user1 = (User)applicationContext.getBean("user");
        System.out.println("user1 = " + user1);

        //2. 根据类型获取
        User user2 = applicationContext.getBean(User.class);
        System.out.println("user2 = " + user2);


        //3.根据id和类型获取
        User user3 = applicationContext.getBean("user", User.class);
        System.out.println("user3 = " + user3);
    }
}
