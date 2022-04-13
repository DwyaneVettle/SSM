package com.sccs.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 张三转账给李四200元
    @Override
    public void reduceMoney() {
        String sql = "update acount set money=money-? where username=?";
        jdbcTemplate.update(sql, 200, "zhangsan");
    }

    // 李四收到200元
    @Override
    public void addMoney() {
        String sql = "update acount set money=money+? where username=?";
        jdbcTemplate.update(sql, 200, "lisi");
    }

}
