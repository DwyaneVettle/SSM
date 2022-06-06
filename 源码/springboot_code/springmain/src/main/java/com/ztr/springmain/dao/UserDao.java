package com.ztr.springmain.dao;

import com.ztr.springmain.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDao {
    // 模拟数据库
    private final ConcurrentMap<Integer,UserEntity> map = new ConcurrentHashMap<>();

    // ID自动生成器
    private final static AtomicInteger idGen = new AtomicInteger();

    // 保存数据
    public boolean save(UserEntity user) {
        int id = idGen.incrementAndGet();
        user.setId(id);
        return map.put(id,user) == null;
    }
    // 根据id查询数据
    public UserEntity selectById(Integer id) {
        return map.get(id);
    }
}
