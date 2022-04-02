package com.sccs.spring.bean;

public class Room {
    private String rNum;

    public void setrNum(String rNum) {
        this.rNum = rNum;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rNum='" + rNum + '\'' +
                '}';
    }
}
