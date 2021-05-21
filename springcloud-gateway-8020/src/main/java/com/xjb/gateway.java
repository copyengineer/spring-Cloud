package com.xjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjb
 * @create 2021-05-20-10:42
 */
@EnableEurekaClient
@SpringBootApplication
public class gateway {

    public static void main(String[] args) {
        SpringApplication.run(gateway.class);//这是注释2
    }
}
