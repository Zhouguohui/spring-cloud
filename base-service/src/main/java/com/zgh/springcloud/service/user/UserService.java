package com.zgh.springcloud.service.user;

import com.zgh.springcloud.entity.User;
import java.util.List;

/**
 * Created by nashwork on 2018/9/10.
 * Version 1.0.1
 */
public interface UserService {
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Integer id);
    List<User> selectUser(User user);
    User getByIdUser(Integer id);
}
