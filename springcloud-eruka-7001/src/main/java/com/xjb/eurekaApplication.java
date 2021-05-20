package com.xjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xjb
 * @create 2021-05-15-14:00
 */
@SpringBootApplication
@EnableEurekaServer
public class eurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApplication.class);
    }
}
