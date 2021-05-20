package com.xjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjb
 * @create 2021-05-14-20:33
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProducerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProducerApplication.class);
    }
}
