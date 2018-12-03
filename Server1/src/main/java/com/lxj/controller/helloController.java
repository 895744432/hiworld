package com.lxj.controller;

import com.lxj.pojo.User;
import com.lxj.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class helloController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    @ResponseBody
    public List<User> hello(){

        return   userService.find();

    }

}
