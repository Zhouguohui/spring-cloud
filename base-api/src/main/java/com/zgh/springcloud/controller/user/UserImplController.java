package com.zgh.springcloud.controller.user;

import com.zgh.springcloud.entity.User;
import com.zgh.springcloud.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nashwork on 2018/9/10.
 * Version 1.0.1
 */
@RestController
@RequestMapping(value = {"user","zgh"})
public class UserImplController {

    @Autowired
    UserService userService;

    @RequestMapping("insertUser")
    public String insertUser(User user){
      int i =   userService.insertUser(user);
      return String.valueOf(i);
    }

    @RequestMapping("updateUser")
    public String updateUser(User user){
        int i =   userService.updateUser(user);
        return String.valueOf(i);
    }

    @RequestMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        int i =   userService.deleteUser(id);
        return String.valueOf(i);
    }

    @RequestMapping("selectUser")
    public List<User> selectUser(User user,Integer pageSize,Integer pageNum){
        return userService.selectUser(user);
    }

    @RequestMapping("getByIdUser")
    public User getByIdUser(Integer id){
        return userService.getByIdUser(id);
    }

}

