package com.springBoot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = { "com.springBoot.demo.dao" })
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
