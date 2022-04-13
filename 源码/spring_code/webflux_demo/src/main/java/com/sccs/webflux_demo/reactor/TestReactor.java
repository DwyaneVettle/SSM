package com.sccs.webflux_demo.reactor;

import org.springframework.web.server.WebHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestReactor {

    public static void main(String[] args) {
        // just()方法可以直接声明元素，FLux可以声明多个元素，Mono只能声明一个
        Flux.just(1,2,3).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::println);

        // 以数组放元素
        Integer[] arrays = {1,2,3,4,};
        Flux.fromArray(arrays);

        // 以List方式
        List<Integer> list = Arrays.asList(arrays);
        Flux.fromIterable(list);

        // Stream流
        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);
        // 错误信号
       // Flux.error(new Exception());
    }
}
