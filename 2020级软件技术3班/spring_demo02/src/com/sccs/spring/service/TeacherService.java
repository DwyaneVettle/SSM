package com.sccs.spring.service;

import com.sccs.spring.repository.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value="teacher")
public class TeacherService {

    // @Resource是Java提供的一个注解，可以根据名称，也可以根据类型完成属性的注入
    // @Value能够通过值来给普通的属性注入
    @Autowired
    @Qualifier(value="teacher01")
    @Resource(name="teacher01")
    private TeacherDao teacherDao;

    @Value(value="敖嫚")
    private String name;

    public void update() {
        teacherDao.update();
        System.out.println(name);
    }
}
