package com.sccs.springboot_web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration(proxyBeanMethods=false)  // 取出和其他组件的依赖
public class WebConfig {

    @Bean
    public HiddenHttpMethodFilter HiddenHttpMethodFilter() {
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m"); // 改成自己设置的
        return methodFilter;
    }
}
