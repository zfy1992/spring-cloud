package com.qf.spring.cloud.eurrka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurrkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurrkaServerApplication.class, args);
    }

}
