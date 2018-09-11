package com.zgh.springcloud.controller.user;

import com.zgh.springcloud.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="test")
public class UserTest {

    private static final Logger logger= LoggerFactory.getLogger(UserTest.class);
    private static final String URL_ADDRESS="http://localhost:8001/user";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("iUser")
    public int iUser(User user){
        logger.info(user.toString()+"--------UserTest-------");
        ResponseEntity<Integer> i = restTemplate.postForEntity(URL_ADDRESS+"/insertUser",user,Integer.class);
        return  i.getBody();
    }
}
