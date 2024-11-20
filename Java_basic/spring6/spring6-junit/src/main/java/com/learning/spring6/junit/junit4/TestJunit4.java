package com.learning.spring6.junit.junit4;

import com.learning.spring6.junit.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  14:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestJunit4 {

    @Autowired
    @Qualifier(value = "user1")
    private User user;

    @Test
    public void test(){
        System.out.println("test 444");
        user.sayHello();
    }

}
