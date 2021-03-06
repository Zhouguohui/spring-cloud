package com.zgh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages="com.zgh")
public class ApplicationServer1 {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationServer1.class,args);

    }

}
