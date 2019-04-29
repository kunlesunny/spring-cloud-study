package com.chenxy.springcloudservicecustomer.service;

import com.chenxy.springcloudservicecustomer.service.impl.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "springcloud-service-provider",fallback = TestServiceImpl.class)
@Service
public interface TestService {

    @GetMapping("/test")
    String customertest();
}
