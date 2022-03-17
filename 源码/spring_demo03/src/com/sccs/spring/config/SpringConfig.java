package com.sccs.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 将当前类作为配置类
@ComponentScan(basePackages = {"com.sccs.spring"})
public class SpringConfig {
}
