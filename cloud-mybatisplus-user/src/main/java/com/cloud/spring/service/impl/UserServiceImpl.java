package com.cloud.spring.service.impl;

import com.cloud.spring.entities.User;
import com.cloud.spring.mapper.UserMapper;
import com.cloud.spring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int create(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectById(id);
    }
}
