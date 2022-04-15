package com.sccs.spring.repository;

import org.springframework.stereotype.Repository;

@Repository(value="abc")
public class UserDaoImpl02 implements UserDao{

    @Override
    public void add() {
        System.out.println("02的add方法执行了。。。。");
    }
}
