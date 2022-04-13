package com.sccs.spring;

public class User {
    private String userName;

    public void add() {
        System.out.println("add方法执行了。。。");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
