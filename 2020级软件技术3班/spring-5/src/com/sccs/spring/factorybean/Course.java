package com.sccs.spring.factorybean;

public class Course {
    private String cName;

    public Course(String cName) {
        this.cName = cName;
    }

    public Course() {
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
