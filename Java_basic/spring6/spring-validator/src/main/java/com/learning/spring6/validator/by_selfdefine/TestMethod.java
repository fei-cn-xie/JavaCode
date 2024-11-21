package com.learning.spring6.validator.by_selfdefine;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  17:35
 */
@SpringJUnitConfig(ValidationConfig.class)
public class TestMethod {

    @Autowired
    private MyService myService;

    @Test
    public void test(){
        User user = new User();
        user.setName("fdsfdsf");
        String s = myService.testMethod(user);
        System.out.println(s);
    }
}
