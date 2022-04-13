package com.sccs.spring.service;

import com.sccs.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

/*
 * @Transactional可以作用在类上，也可以作用在方法上
 * 作用在类上表示所有方法都开启事务，作用在方法只是在该方法中实现事务*/
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    // 转账的方法
    public void accountMoney() {

        // 张三转账少200
        userDao.reduceMoney();
        // 模拟异常出现
        int i = 10 / 0;
        // 李四收款多200
        userDao.addMoney();

    }
}
