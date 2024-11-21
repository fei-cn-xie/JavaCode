package com.learning.spring6.validator.by_interface;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  16:09
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1000);
        person.setName("jack");

        //创建person的databinder
        DataBinder binder = new DataBinder(person);


        //设置校验器
        binder.setValidator(new PersonValidator());

        //调用方法校验
        binder.validate();

        //得到结果
        BindingResult bindingResult = binder.getBindingResult();
        System.out.println(bindingResult);
    }
}
