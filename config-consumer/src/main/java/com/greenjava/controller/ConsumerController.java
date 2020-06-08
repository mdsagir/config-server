package com.greenjava.controller;

import com.greenjava.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public ConsumerService consumerService() {
        return consumerService;
    }
}
