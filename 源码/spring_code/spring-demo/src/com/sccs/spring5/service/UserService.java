package com.sccs.spring5.service;

import com.sccs.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("add()方法执行了......");
        userDao.update();
    }
}
