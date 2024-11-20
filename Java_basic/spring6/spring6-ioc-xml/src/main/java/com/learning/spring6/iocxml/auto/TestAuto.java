package com.learning.spring6.iocxml.auto;

import com.learning.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  19:44
 */
public class TestAuto {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController controller = applicationContext.getBean("controller", UserController.class);
        controller.addUser();
    }
}
