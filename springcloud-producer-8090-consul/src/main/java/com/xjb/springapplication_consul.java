package com.xjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xjb
 * @create 2021-05-16-15:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class springapplication_consul
{
    public static void main(String[] args)
    {
        SpringApplication.run(springapplication_consul.class,args);
    }
}