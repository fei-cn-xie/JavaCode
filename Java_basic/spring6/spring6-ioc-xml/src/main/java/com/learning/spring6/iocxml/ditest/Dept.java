package com.learning.spring6.iocxml.ditest;

import java.util.List;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  17:35
 */
public class Dept {
    private String name;

    private List<Emp> empList;

    @Override
    public String toString() {
        return "Dept{" +
                "empList=" + empList +
                ", name='" + name + '\'' +
                '}';
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info(){
        System.out.println("Department Name = " + this.name);
        System.out.println(this.empList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
