package com.learning.spring6.validator.by_annotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  16:32
 */

@SpringJUnitConfig(ValidationConfig.class)
public class TestValidator {

    @Autowired
    private MyValidator1 myValidator1;

    @Autowired
    private MyValidator2 myValidator2;

    @Test
    public void test01(){
        User user = new User();
        user.setAge(180);
        user.setName("zhangsan");
        boolean b = myValidator1.validate1(user);
        System.out.println(b);

    }


    @Test
    public void test02(){
        User user = new User();
        user.setAge(18000);
        user.setName("zhangsan");
        boolean b = myValidator2.validate2(user);
        System.out.println(b);
    }
}
