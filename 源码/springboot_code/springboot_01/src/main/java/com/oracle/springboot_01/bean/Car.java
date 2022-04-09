package com.oracle.springboot_01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
*@Component:将car放到容器中，只有容器中的组件才能配置生效
*ConfigurationProperties读取配置文件中前缀为mycar的属性赋值  */
// @Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand; // 品牌
    private Integer price; // 价格

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
