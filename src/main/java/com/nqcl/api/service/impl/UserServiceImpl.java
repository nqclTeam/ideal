package com.nqcl.api.service.impl;

import com.nqcl.api.dao.UserMapper;
import com.nqcl.api.entity.User;
import com.nqcl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> hello() throws Exception {
        return userMapper.hello();
    }
}