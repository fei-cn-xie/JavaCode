package com.learning.spring6.junit.junit5;

import com.learning.spring6.junit.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  14:02
 */

@SpringJUnitConfig(SpringConfig.class)
public class TestJunit5 {

    @Autowired
    private User user;


    @Test
    public void testJunit5() {
        user.sayHello();

    }

}

