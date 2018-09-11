package com.zgh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages="com.zgh")
public class ApplicationServer2 {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationServer2.class,args);

    }

}
