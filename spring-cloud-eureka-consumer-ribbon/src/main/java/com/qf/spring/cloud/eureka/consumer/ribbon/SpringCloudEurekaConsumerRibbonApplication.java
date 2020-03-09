package com.qf.spring.cloud.eureka.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerRibbonApplication.class, args);
    }

}
