package com.yfs.cloud.customer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-server")
public interface Service {

    @RequestMapping("/test")
    public String test();

}
