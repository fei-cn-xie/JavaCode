package com.learning.ssm.tx;

import com.learning.ssm.tx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  16:49
 */
@SpringBootTest
public class AccountTest {
    @Autowired
    UserService userService;

    @Test
    public void test() {
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
        userService.checkout("zhangsan", 1, 3);

    }

    @Test
    public void test1() {
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
        userService.checkout("wangwu", 3, 3);

    }

}
