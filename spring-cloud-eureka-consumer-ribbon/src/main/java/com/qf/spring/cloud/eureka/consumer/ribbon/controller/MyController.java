package com.qf.spring.cloud.eureka.consumer.ribbon.controller;

import com.qf.spring.cloud.eureka.consumer.ribbon.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private MyService service;

    @RequestMapping("hi")
    @ResponseBody
    public String sayHi(String message){
        return service.sayHi(message);
    }
}

