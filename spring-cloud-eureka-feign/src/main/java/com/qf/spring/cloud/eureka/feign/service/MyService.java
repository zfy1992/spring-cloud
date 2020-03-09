package com.qf.spring.cloud.eureka.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "hello-spring-cloud-service-admin")
public interface MyService {

    @RequestMapping("hi")
    public String sayHi(@RequestParam String message);
}
