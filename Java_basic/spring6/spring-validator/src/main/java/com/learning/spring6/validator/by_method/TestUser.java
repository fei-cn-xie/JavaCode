package com.learning.spring6.validator.by_method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  17:08
 */
@SpringJUnitConfig(ValidationConfig.class)
public class TestUser {

    @Autowired
    MyService myService;

    @Test
    public void test(){
        User user = new User();
        user.setAge(10);
        user.setName("zhangsan");
        String s = myService.testMethod(user);
        System.out.println(s);
    }
}
