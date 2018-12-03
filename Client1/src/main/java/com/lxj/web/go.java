package com.lxj.web;


import com.lxj.cccc.Feign1;
import com.lxj.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@DefaultProperties(defaultFallback = "error")
public class go {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Feign1 fe;


    @RequestMapping("go")
    @HystrixCommand(
          commandProperties = {
                  @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
          }

    )
    public String go(){

        return fe.queryUser();

    }

    public String error(){
        return "不好意思 服务器太拥挤";
    }

}
