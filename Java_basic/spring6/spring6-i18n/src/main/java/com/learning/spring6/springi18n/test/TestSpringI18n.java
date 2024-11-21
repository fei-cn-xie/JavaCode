package com.learning.spring6.springi18n.test;

import com.learning.spring6.springi18n.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Locale;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  19:19
 */
@SpringJUnitConfig(SpringConfig.class)
public class TestSpringI18n {

    @Autowired
    ResourceBundleMessageSource messageSource;

    @Test
    public void test01() {
        String test = messageSource.getMessage("test", null, Locale.US);
        System.out.println(test);
    }
}
