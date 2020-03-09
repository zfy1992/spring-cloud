package com.qf.spring.cloud.eureka.feign.controller;

import com.qf.spring.cloud.eureka.feign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.dc.pr.PRError;

@Controller
public class MyController {

    @Autowired
    private MyService service;

    @RequestMapping("hi")
    @ResponseBody
    public String sayHi(@RequestParam String message){

        return service.sayHi(message);
    }
}

