package com.dh.feign.server.feignserverdemo.Impl;

import com.dh.feign.server.feignserverdemo.TestService;
import org.springframework.stereotype.Controller;

/**
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2019/4/23
 * @Time:13:48
 */
@Controller
public class TestServiceImpl implements TestService {
    @Override
    public String getTest(String name) {
        return name+"调用Feign成功";
    }
}
