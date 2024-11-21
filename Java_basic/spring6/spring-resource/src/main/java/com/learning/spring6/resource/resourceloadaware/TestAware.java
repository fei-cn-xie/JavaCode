package com.learning.spring6.resource.resourceloadaware;

import com.learning.spring6.resource.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  18:21
 */
public class TestAware {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean("testBean", TestBean.class);
        ResourceLoader resourceLoader = bean.getResourceLoader();
        System.out.println(context == resourceLoader);

    }
}
