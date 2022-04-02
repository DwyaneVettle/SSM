package com.sccs.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao中的add()方法执行了。。。");
    }
}
