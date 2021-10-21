package com.example.employee.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MainConfig {
    @Bean(name = "restTemplate")
//    @LoadBalanced
     /*Load balance service calls as the outgoing service calls are through Eureka Registry.
     LoadBalanced Not Needed if API Gateway us used for making calls to other services using this restTemplate.
     Otherwise service calls will result in error: java.lang.IllegalStateException: No instances available for localhost*/
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
