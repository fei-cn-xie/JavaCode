package com.learning;

import com.learning.bean.MyAnnotationApplicationContext;
import com.learning.bean.MyApplicationContext;
import com.learning.dao.UserDao;
import com.learning.dao.impl.UserDaoImpl;
import com.learning.service.UserService;
import com.learning.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  16:13
 */
public class TestUser {


    @Test
    public void test() throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        MyApplicationContext myApplicationContext = new MyAnnotationApplicationContext("com.learning");
        UserService bean = (UserService)myApplicationContext.getBean(UserServiceImpl.class);
        System.out.println(bean);
        bean.add();


    }
}
