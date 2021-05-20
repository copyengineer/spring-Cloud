package com.xjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author xjb
 * @create 2021-05-17-18:38
 */
@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
public class hystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(hystrixApplication.class);
    }
}
