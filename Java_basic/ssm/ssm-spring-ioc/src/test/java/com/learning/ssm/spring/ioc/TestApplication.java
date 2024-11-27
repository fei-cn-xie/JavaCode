package com.learning.ssm.spring.ioc;

import com.learning.ssm.spring.ioc.bean.AUUID;
import com.learning.ssm.spring.ioc.bean.UUID;
import com.learning.ssm.spring.ioc.bean.User;
import com.learning.ssm.spring.ioc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  22:16
 */

@SpringBootTest
public class TestApplication {

//    @Autowired
//    private User user;

    @Autowired
    private AUUID uuid;

    @UUID
    private String uuidStr;


    @Test
    void test(){
//        System.out.println(user);
        System.out.println("--------------");
        System.out.println("uuid = " + uuid);
        System.out.println("uuidStr = " + uuidStr);
    }
}
