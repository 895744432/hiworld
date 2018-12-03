package com.lxj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GEte1 {

    public static void main(String[] args) {
        SpringApplication.run(GEte1.class);
    }
}
