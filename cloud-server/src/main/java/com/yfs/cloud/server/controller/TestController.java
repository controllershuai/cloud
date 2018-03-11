package com.yfs.cloud.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/test")
    public String test(){
        return "cloud-server 端口号是:" +port;
    }
}
