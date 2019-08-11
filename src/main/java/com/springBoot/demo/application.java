package com.springBoot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.springBoot.demo.dao" })
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
