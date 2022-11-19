package com.example.springbootbestpractices;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.*" )
@Slf4j
public class SpringbootBestPracticesApplication {

    public static void main(String[] args) {
        log.info("Starting Springboot Application");
        SpringApplication.run(SpringbootBestPracticesApplication.class, args);
        log.info("Springboot finished application");
    }

}
