package com.learning.spring6.resource.demo;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * @Author fei
 * @Version 1.0
 * @Description 演示访问网络资源
 * @DATA 2024/11/20  17:44
 */
public class UrlResourceDemo {
    // 访问网络资源
    public static void main(String[] args) throws MalformedURLException {
        //创建Resource实现类
        UrlResource urlResource = new UrlResource("https://www.mouser.hk/images/marketingid/2018/df/184941745.jpg?v=070223.1032");
        //获取资源信息
        System.out.println(urlResource.getFilename());
        System.out.println(urlResource.getDescription());
        System.out.println(urlResource.getURL());
        System.out.println(urlResource.isFile());
    }

}
