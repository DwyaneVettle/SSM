package com.sccs.webflux_demo01.service;

import com.sccs.webflux_demo01.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    //根据 id 查询用户
    Mono<User> getUserById(int id);
    //查询所有用户
    Flux<User> getAllUser();
    //添加用户
    Mono<Void> saveUserInfo(Mono<User> user);
}
