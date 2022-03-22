package com.sccs.spring.bean;

public class Student {
    private String sName;
    private String gender;
    private Cls cls;
    private Room room;

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Cls getCls() {
        return cls;
    }

    public void setCls(Cls cls) {
        this.cls = cls;
    }
    public void test() {
        System.out.println(sName+ ":" + gender + ":" +cls + ":" +room);
    }
}
