package com.oracle.springboot_01.bean;

public class Pet {
    private String Pname;

    public Pet(String pname) {
        Pname = pname;
    }

    public Pet() {
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }
}
