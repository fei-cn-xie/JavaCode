package com.learning.spring6.resource.resourceloadaware;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  18:17
 */

@Component
public class TestBean implements ResourceLoaderAware, InitializingBean {


    private ResourceLoader resourceLoader;

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;

    }
}
