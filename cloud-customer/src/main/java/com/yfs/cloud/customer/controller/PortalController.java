package com.yfs.cloud.customer.controller;

import com.yfs.cloud.customer.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {

    @Autowired
    private Service service;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return  service.test();
    }
}
