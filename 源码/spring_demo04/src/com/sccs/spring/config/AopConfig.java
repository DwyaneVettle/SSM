package com.sccs.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.sccs.spring"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
