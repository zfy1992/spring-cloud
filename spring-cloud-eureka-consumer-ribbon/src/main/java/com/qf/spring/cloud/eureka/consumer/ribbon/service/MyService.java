package com.qf.spring.cloud.eureka.consumer.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message){
        String url = "http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message="+message;
        return restTemplate.getForObject(url,String.class);
    }
}
