package com.lxj.server;

import com.lxj.mapper.UserMapper;
import com.lxj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public List<User> find(){


        return userMapper.selectAll();
    }
}
