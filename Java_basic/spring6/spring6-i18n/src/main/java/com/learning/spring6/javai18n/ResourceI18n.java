package com.learning.spring6.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  19:07
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        String test = bundle.getString("test");
        System.out.println(test);
    }
}
