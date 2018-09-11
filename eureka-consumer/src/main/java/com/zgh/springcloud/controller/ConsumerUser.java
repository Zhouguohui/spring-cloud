package com.zgh.springcloud.controller;

import com.zgh.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by nashwork on 2018/9/11.
 * Version 1.0.1
 */
@RestController
@RequestMapping(value={"consumer"})
public class ConsumerUser {
    private static final String EUREKA_URL = "http://SPRINGCLOUD";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("iUser")
    public String insertUser(User user){
        String str = restTemplate.postForObject(EUREKA_URL+"/user/insertUser",user,String.class);
        return str.toString();
    }

    @RequestMapping("uUser")
    public String updateUser(User user){
        String str = restTemplate.postForObject(EUREKA_URL+"/user/updateUser",user,String.class);
        return str.toString();
    }

    @RequestMapping("dUser/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        restTemplate.delete(EUREKA_URL+"/user/deleteUser?id="+id);
        return String.valueOf(1);
    }

    @RequestMapping("sUser")
    public List<User> selectUser(User user, Integer pageSize, Integer pageNum){
        List<User> l = restTemplate.getForObject(EUREKA_URL+"/user/selectUser",List.class,user);
        return l;
    }

    @RequestMapping("getByIdU")
    public User getByIdUser(Integer id){
       User u =  restTemplate.getForObject(EUREKA_URL+"/user/getByIdUser",User.class,id);
       return u;
    }

}

