package com.oracle.springboot_01.controller;

import com.oracle.springboot_01.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController：将数据返回为json，相当于@Controller和@ResponseBody的结合*/
@RestController
public class HelloContrller {

    @Autowired
    private Car car;
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/car")
    public Car car() {
        return car;
    }
}
