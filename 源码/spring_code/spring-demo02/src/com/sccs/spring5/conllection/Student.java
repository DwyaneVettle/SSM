package com.sccs.spring5.conllection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/23
 **/
public class Student {
    // 1.数组类型
    private String[] course;
    // 2.list集合类型
    private List<String> list;
    // 3.map集合类型
    private Map<String, String> maps;
    // 4.set集合
    private Set<String> set;
    // 5.创建课程集合对象，代表学生所学的多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void test() {
        System.out.println(Arrays.toString(course));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(set);
        System.out.println(courseList);
    }

}
