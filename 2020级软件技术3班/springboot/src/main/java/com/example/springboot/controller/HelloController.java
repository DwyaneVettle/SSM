package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/4/9
 * @Copyright 四川城市职业学院
 **/
@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/hello")
    public String test() {
        return "Hello World!";
    }
}
