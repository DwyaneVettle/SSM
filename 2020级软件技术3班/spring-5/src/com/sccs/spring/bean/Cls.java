package com.sccs.spring.bean;

public class Cls {

    private String cName;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Cls{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
