package com.zgh.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nashwork on 2018/9/11.
 * Version 1.0.1
 */
@Configuration
public class RestTemplateConfig {

    /**
     *  @LoadBalanced 为ribbon 负载均衡的一种算法注解
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

