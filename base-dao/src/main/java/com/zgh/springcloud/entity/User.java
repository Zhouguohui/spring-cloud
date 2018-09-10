package com.zgh.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by nashwork on 2018/9/10.
 * Version 1.0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain=true)
public class User implements Serializable{

    private Integer id;

    private String userName;

    private String address;

    private Date createTime;

    private String email;

    private Integer eId;

}

