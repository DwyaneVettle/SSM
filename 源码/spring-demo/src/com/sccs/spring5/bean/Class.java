package com.sccs.spring5.bean;

public class Class {
    private String cName;

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
