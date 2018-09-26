package com.zgh.springcloud.controller.user;

import com.zgh.springcloud.entity.User;
import com.zgh.springcloud.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nashwork on 2018/9/10.
 * Version 1.0.1
 */
@RestController
@RequestMapping(value = {"user","zgh"})
public class UserImplController {
    private static final Logger logger= LoggerFactory.getLogger(UserImplController.class);
    @Autowired
    UserService userService;

    @RequestMapping("insertUser")
    public String insertUser(@RequestBody User user){
        logger.info(user.toString()+"--------UserImplController-------");
      int i =   userService.insertUser(user);
      return String.valueOf(i);
    }

    @RequestMapping("updateUser")
    public String updateUser(@RequestBody User user){
        int i =   userService.updateUser(user);
        return String.valueOf(i);
    }

    @RequestMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        int i =   userService.deleteUser(id);
        return String.valueOf(i);
    }

    @RequestMapping("selectUser")
    public List<User> selectUser(@RequestBody User user,Integer pageSize,Integer pageNum){
        logger.info(user.toString()+"----------"+String.valueOf(pageSize)+"--------"+String.valueOf(pageNum)+"--------getByIdUser-------");
        return userService.selectUser(user);
    }

    @RequestMapping("getByIdUser")
    public User getByIdUser(Integer id){
        logger.info(String.valueOf(id)+"--------getByIdUser-------");
        return userService.getByIdUser(id);
    }

}

