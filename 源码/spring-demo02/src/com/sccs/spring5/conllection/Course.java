package com.sccs.spring5.conllection;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/23
 **/
public class Course {
    private String cName;

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
