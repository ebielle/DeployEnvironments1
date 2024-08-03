package com.example.deploy_environment1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment env;

    @GetMapping("/greeting")
    public String getGreeting() {
        String authCode = env.getProperty("myAuthCodeTree.authCode");
        String devName = env.getProperty("myDevNameTree.devName");
        return ("Hello, " + devName + "! Your auth code is " + authCode);
    }
}