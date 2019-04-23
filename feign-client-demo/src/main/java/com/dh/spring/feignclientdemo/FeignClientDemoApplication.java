package com.dh.spring.feignclientdemo;

import com.dh.feign.server.feignserverdemo.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.dh")
@EnableDiscoveryClient
@RestController
public class FeignClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientDemoApplication.class, args);
    }

    @Autowired
    TestService testService;

    @RequestMapping("/getClientTest")
    public String getTest(@RequestParam("name") String name){
        return testService.getTest(name);
    }

}
