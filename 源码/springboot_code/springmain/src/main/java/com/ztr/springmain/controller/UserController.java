package com.ztr.springmain.controller;

import com.ztr.springmain.dao.UserDao;
import com.ztr.springmain.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    // 查询
    @GetMapping("/get")
    public UserEntity selectById(Integer id) {
        return userDao.selectById(id);
    }

    @PostMapping("/save")
    public UserEntity save(String name,Integer age,String remark) {
        UserEntity user = new UserEntity();
        user.setAge(age);
        user.setName(name);
        user.setRemark(remark);
        boolean rs = userDao.save(user);
        if (rs) {
            System.out.printf("保存成功 %s \n",user);
        }
        return user;

    }

}
