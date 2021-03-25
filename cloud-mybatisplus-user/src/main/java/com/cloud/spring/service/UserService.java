package com.cloud.spring.service;

import com.cloud.spring.entities.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public int create(User user);
    public int deleteById(@Param("id") Long id);
    public User findById(@Param("id") Long id);
}
