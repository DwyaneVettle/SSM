package com.oracle.aa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/aa")
    public String aa() {
        return "你好";
    }
}
