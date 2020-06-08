package com.greenjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class ConsumerService {

    @Autowired
    private Environment environment;

//    public String getDefault() {
//        return environment.getProperty("message.greeting");
//    }

    public String getGreeting() {
        return environment.getProperty("message.greeting");
    }
}
