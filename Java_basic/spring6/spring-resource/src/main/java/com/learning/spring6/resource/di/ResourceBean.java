package com.learning.spring6.resource.di;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  18:25
 */
@Component
public class ResourceBean {

    @Value("${r.url}")
    private Resource resource;

    @Autowired
    @Qualifier("configUrl")
    private String url;

    public void parse(){
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        System.out.println(url);
    }


    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
