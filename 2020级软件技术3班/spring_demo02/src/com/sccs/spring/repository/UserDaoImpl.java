package com.sccs.spring.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "123")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao的add()方法执行了。。。");
    }
}
