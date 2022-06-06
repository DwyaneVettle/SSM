package com.sydx.dao;

import com.sydx.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 增加用户
    int create(User user);
    // 删除用户
    int delete(Map<String,Object> map);
    // 修改用户
    int update(Map<String,Object> map);
    // 查询用户
    List<User> query(Map<String,Object> map);
    // 分页查询
    int count(Map<String,Object> map);
    // 用户详情
    User detail(Map<String,Object> map);
}
