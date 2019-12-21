package com.qf.entity;

import lombok.Data;

/**
 * @ClassName One
 * @Data 2019/12/19 11:20
 * @Version 1.0
 */
/**
 * id 用户id
 * username 用户名称
 * password 用户密码
 * sex 默认为1男/0为女
 * phone 电话可以不添加
 * type 用户权限默认为0/1为音乐人/2为管理员
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer sex;
    private String phone;
    private Integer type;



}
