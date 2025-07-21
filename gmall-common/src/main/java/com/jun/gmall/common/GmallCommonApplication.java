package com.jun.gmall.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GmallCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCommonApplication.class, args);
    }

}
