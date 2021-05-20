package com.xjb;

import com.netflix.ribbon.Ribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xjb
 * @create 2021-05-16-20:54
 */
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class OpenFeign {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeign.class);
    }
}
