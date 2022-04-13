package com.sccs.spring5.bean;

public class Student {
    private String sName;
    private String gender;
    // 学生属于一个班级，使用对象标识
    private Class cls;

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }

    public void test() {
        System.out.println(sName + ":" + gender + ":" + cls);
    }
}
