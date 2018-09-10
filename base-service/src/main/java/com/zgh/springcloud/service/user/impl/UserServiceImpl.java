package com.zgh.springcloud.service.user.impl;

import com.zgh.springcloud.entity.User;
import com.zgh.springcloud.service.user.UserService;
import com.zgh.springcloud.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nashwork on 2018/9/10.
 * Version 1.0.1
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public List<User> selectUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public User getByIdUser(Integer id) {
        return userMapper.getByIdUser(id);
    }
}

