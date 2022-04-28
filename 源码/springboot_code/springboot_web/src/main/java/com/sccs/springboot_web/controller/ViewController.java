package com.sccs.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String view(Model model) {
        // model中的数据放到请求域
        model.addAttribute("msg","你好，Thymeleaf");
        model.addAttribute("link","https://www.baidu.com");
        return "success";
    }
}
