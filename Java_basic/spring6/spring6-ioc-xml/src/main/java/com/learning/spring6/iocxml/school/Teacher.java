package com.learning.spring6.iocxml.school;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  18:36
 */
public class Teacher {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
