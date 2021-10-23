package com.example.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixFallbackController {

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        return "{\"error\":\"Department Service may be down.  Please try after some time.  Please contact administrator if the issue still persists\"}";
    }
    @GetMapping("/employeeServiceFallback")
    public String employeeServiceFallback(){
        return "{\"error\":\"Employee Service may be down.  Please try after some time.  Please contact administrator if the issue still persists\"}";
    }

}
