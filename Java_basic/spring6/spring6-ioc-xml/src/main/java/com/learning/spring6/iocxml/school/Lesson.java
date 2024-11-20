package com.learning.spring6.iocxml.school;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  17:31
 */
public class Lesson {
    private String name;
    private Teacher teacher;

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
