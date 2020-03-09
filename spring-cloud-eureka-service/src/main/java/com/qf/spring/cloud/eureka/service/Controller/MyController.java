package com.qf.spring.cloud.eureka.service.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Value("${server.port}")
    private String serverProt;

    @RequestMapping("hi")
    @ResponseBody
    public String sayHi(String message) {
        return String.format("当前是来自于%s的消息： %s",serverProt,message);
    }
}
