package com.sccs.spring.service;

import com.sccs.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/*
Component注解的value值可以不写，不写是默写为类名首字母小写*/
@Component(value="userService")
public class UserService {

    // 注入普通属性
    @Value(value="james")
    private String name;
    @Resource(name="userDaoImpl") // 根据名称注入
    private UserDao userDao;
    public void test() {
        System.out.println("service的test()方法执行了。。。");
        userDao.add();
        System.out.println(name);
    }
}
