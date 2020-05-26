package com.sittinon.employeeprofile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @Value("${first.name}")
    private String name;

    @GetMapping("/check")
    private String healthCheck(){
        return "OKAY " + name;
    }
    @GetMapping("/duration")
    private String healthDuration(){
        return "1 Hour";
    }
}
