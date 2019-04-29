package com.chenxy.springcloudservicecustomer.service.impl;

import com.chenxy.springcloudservicecustomer.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {
    @Override
    public String customertest() {
        return "service error!";
    }
}
