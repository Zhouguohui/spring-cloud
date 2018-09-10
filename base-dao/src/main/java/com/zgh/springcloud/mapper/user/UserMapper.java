package com.zgh.springcloud.mapper.user;

import com.zgh.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nashwork on 2018/9/10.
 * Version 1.0.1
 */
@Mapper
public interface UserMapper {
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Integer id);
    List<User> selectUser(User user);
    User getByIdUser(Integer id);
}

