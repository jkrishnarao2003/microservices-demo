package com.example.api.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HystrixFallbackController {

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        log.info("departmentServiceFallback");
        return "{\"error\":\"Department Service may be down.  Please try after some time.  Please contact administrator if the issue still persists\"}";
    }
    @GetMapping("/employeeServiceFallback")
    public String employeeServiceFallback(){
        log.info("employeeServiceFallback");
        return "{\"error\":\"Employee Service may be down.  Please try after some time.  Please contact administrator if the issue still persists\"}";
    }

}
