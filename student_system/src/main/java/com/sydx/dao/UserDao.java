package com.sydx.dao;

import com.sydx.entity.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserDao {

    int create(User user);
}
