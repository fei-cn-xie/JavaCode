package com.learning.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  15:11
 */
public class TestUserDAO {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserDAO userDAO = (UserDAO) ac.getBean(UserDAO.class);
        System.out.println(userDAO);
    }
}
