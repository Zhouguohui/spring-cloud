package com.zgh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by nashwork on 2018/9/10.
 * Version 1.0.1
 */
@SpringBootApplication(scanBasePackages="com.zgh")
@EnableEurekaClient
public class ApplicationServerConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationServerConsumer.class,args);
    }
}

