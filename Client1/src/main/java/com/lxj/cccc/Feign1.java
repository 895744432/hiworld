package com.lxj.cccc;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Server1")
public interface Feign1 {

    @GetMapping("hello")
    String queryUser();
}
