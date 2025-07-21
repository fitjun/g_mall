package com.jun.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.jun.gmall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallProductApplication.class, args);
    }

}
