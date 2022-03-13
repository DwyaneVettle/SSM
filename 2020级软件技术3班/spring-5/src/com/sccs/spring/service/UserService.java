package com.sccs.spring.service;

import com.sccs.spring.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("add()方法执行了。。。。");
    }
}
