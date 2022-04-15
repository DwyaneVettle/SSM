package com.sccs.spring.repository;

import org.springframework.stereotype.Repository;

@Repository(value="teacher01")
public class TeacherDaoImpl implements TeacherDao{

    @Override
    public void update() {
        System.out.println("hello....");
    }
}
