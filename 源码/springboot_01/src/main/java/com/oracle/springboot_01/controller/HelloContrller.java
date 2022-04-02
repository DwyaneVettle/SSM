package com.oracle.springboot_01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController：将数据返回为json，相当于@Controller和@ResponseBody的结合*/
@RestController
public class HelloContrller {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
