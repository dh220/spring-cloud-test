package com.dh.feign.server.feignserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServerDemoApplication.class, args);
    }

}
