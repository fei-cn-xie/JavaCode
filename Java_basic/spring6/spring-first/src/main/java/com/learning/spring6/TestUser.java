package com.learning.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author fei
 * @version 1.0
 */
public class TestUser {

    Logger logger = LoggerFactory.getLogger(TestUser.class);


    @Test
    public void testLog(){
        logger.info("Log info printed....");
        logger.debug("Log debug printed....");
        logger.error("Log error printed....");
        logger.trace("### Log trace printed....");
    }

    @Test
    public void testUserObject(){
        //加载配置文件, 创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        User user = (User)context.getBean("user");
        System.out.println(user);

        //使用对象方法进行测试
        user.add();
    }

    //反射创建对象
    @Test
    public void testUserObjectCreateByReflection() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class clazz = Class.forName("com.learning.spring6.User");

        //创建对象
        User user = (User)clazz.getDeclaredConstructor().newInstance();



    }
}
