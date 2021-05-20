package com.xjb.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xjb
 * @create 2021-05-15-10:43
 */
@Configuration
public class RestTemplateConfig {

    @LoadBalanced//负载均衡（默认轮询）
    @Bean("restTemplate")
    public RestTemplate get(){
        return new RestTemplate();
    }
}
