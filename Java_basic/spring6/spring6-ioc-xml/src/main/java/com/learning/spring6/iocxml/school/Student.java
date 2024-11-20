package com.learning.spring6.iocxml.school;

import java.util.List;
import java.util.Map;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  18:36
 */
public class Student {
    private String name;
    private int age;
    private Map<String, Teacher> teacherMap;
    private List<Lesson> lessonList;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", teacherMap=" + teacherMap +
                ", lessonList=" + lessonList +
                '}';
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Teacher> getMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> map) {
        this.teacherMap = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
