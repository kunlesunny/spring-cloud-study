package com.chenxy.springcloudservicecustomer.controller;

import com.chenxy.springcloudservicecustomer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("customertest")
    public String get(){
        return testService.customertest();
    }
}
