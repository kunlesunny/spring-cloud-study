package com.chenxy.springcloudservicerabbitmq.controller;

import com.chenxy.springcloudservicerabbitmq.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Sender sender;

    @GetMapping("send")
    public String send (){
        sender.send();
        return "发送成功！";
    }
}
