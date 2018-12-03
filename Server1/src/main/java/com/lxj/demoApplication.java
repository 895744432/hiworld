package com.lxj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lxj.mapper")
@EnableDiscoveryClient
public class demoApplication {

    public static void main(String[] args) {

        SpringApplication.run(demoApplication.class);


    }
}
