package com.sccss.spring.conllection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
    public String[] course;
    public List<String> teacher;
    private Map<String,String> position;
    private Set<String> uname;
    private List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public List<String> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<String> teacher) {
        this.teacher = teacher;
    }

    public Map<String, String> getPosition() {
        return position;
    }

    public void setPosition(Map<String, String> position) {
        this.position = position;
    }

    public Set<String> getUname() {
        return uname;
    }

    public void setUname(Set<String> uname) {
        this.uname = uname;
    }

    public void test(){
        System.out.println(Arrays.toString(course));
        System.out.println(teacher);
        System.out.println(position);
        System.out.println(uname);
        System.out.println(courseList);
    }
}
