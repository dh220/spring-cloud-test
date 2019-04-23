package com.dh.feign.server.feignserverdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2019/4/23
 * @Time:13:47
 */
@FeignClient(value = "feign-server")
public interface TestService {

    @RequestMapping("/getTest")
    String getTest(@RequestParam("name") String name);

}
