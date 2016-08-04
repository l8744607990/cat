package com.lius.cat.service;

import com.lius.cat.entity.User;

/**
 * 用户service接口
 * User : liulu ,
 * Date : 2016-7-20 20:43 ,
 * version $Id: UserService.java, v 0.1 Exp $
 */
public interface UserService {

    /**
     * 根据用户手机号查找用户
     * @param phone 用户登录手机号
     * @return 用户实体
     */
    User findByPhone (String phone) ;

    /**
     * 注册新用户
     * @param user 新用户实体
     * @return 注册是否成功
     */
    Boolean register (User user);

    /**
     * 用户登录
     * @param phone 登录手机号
     * @param passwd 登录密码
     * @return 登录是否成功
     */
    Boolean login(String phone, String passwd);


}
