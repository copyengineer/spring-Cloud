package com.xjb;

import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xjb
 * @create 2021-05-17-20:40
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class);

    }
}
