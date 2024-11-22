package com.learning.mvc.anno.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/22  19:04
 */
public class WebXML extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 指定Spring配置类
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /**
     * 指定SpringMVC配置类
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    /**
     * 指定SpringMVC的映射规则，即url-pattern
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
