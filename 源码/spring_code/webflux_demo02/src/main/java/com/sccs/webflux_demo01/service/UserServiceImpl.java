package com.sccs.webflux_demo01.service;

import com.sccs.webflux_demo01.entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    // 构造map
    private final Map<Integer,User> users = new HashMap<>();
    public UserServiceImpl() {
        this.users.put(1,new User("micheal","boy",18));
        this.users.put(2,new User("james","boy",25));
        this.users.put(3,new User("lucy","girl",17));
    }
    @Override
    public Mono<User> getUserById(int id) {
        // 根据id获取
        return Mono.justOrEmpty( this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person -> {
            // 向map里面放值
            int id =users.size()+1;
            users.put(id,person);
        }).thenEmpty(Mono.empty());
    }
}
