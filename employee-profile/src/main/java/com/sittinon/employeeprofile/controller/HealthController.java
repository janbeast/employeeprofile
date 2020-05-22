package com.sittinon.employeeprofile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/check")
    private String healthCheck(){
        return "OKAY";
    }
    @GetMapping("/duration")
    private String healthDuration(){
        return "1 Hour";
    }
}
