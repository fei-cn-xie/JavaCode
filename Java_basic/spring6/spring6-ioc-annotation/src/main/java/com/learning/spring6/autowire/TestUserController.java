package com.learning.spring6.autowire;

import com.learning.spring6.autowire.controller.UserController;
import com.learning.spring6.bean.User;
import com.learning.spring6.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  12:43
 */
public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController bean = applicationContext.getBean(UserController.class);
        bean.addUser();
    }

    @Test
    public void testUser() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = context.getBean(UserController.class);
        bean.addUser();
    }
}
