package com.learning.spring6.resource.di;

import com.learning.spring6.resource.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  18:28
 */

@SpringJUnitConfig(SpringConfig.class)
public class TestDI {

    @Autowired
    ResourceBean resourceBean;

    @Test
    public void test01(){
        System.out.println("test01");
        resourceBean.parse();
    }
}
