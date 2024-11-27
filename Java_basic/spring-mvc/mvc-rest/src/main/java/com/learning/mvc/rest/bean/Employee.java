package com.learning.mvc.rest.bean;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/24  22:41
 */
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private Integer gender;

    public Employee(String email, Integer gender, Integer id, String name) {
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.name = name;
    }
    public Employee() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
