package com.sccs.spring.service;

import com.sccs.spring.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component(value="user")
@Service(value="user")
public class UserService {

    // 实现UserDao属性的注入
    /*
    *  @Autowired通过属性的类型来实现的
    * @Qualifier根据属性的名称来实现*/
    @Autowired
    @Qualifier(value="123")
    private UserDao userDao;

    public void test() {
        System.out.println("test()方法执行了。。。。。");
        userDao.add();
    }




}
