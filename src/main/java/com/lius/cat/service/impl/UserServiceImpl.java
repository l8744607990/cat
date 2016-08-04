package com.lius.cat.service.impl;

import com.dexcoder.commons.utils.EncryptUtils;
import com.dexcoder.dal.JdbcDao;
import com.lius.cat.core.Constant;
import com.lius.cat.entity.User;
import com.lius.cat.exception.CatException;
import com.lius.cat.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service实现类
 * User : liulu ,
 * Date : 2016-7-20 20:44 ,
 * version $Id: UserServiceImpl.java, v 0.1 Exp $
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcDao jdbcDao;

    @Override
    public User findByPhone(String phone) {

        User user = new User();
        user.setPhone(phone);
        return jdbcDao.querySingleResult(user);
    }

    @Override
    public Boolean register(User user) {
        if (StringUtils.isEmpty(user.getPhone()) || StringUtils.isEmpty(user.getPasswd())) {
            throw new CatException("手机号和密码为必填项");
        }
        if (findByPhone(user.getPhone()) != null) {
            throw new CatException("该手机号已注册");
        }
        String md5Passwd = EncryptUtils.getMD5(Constant.PASSWD_PREFIX + user.getPasswd());
        user.setPasswd(md5Passwd);
        jdbcDao.save(user);
        return true;
    }

    @Override
    public Boolean login(String phone, String passwd) {
        if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(passwd)) {
            throw new CatException("手机号或密码不能为空");
        }
        User user = findByPhone(phone);
        if (user == null) {
            throw new CatException("手机号不存在");
        }
        if (!StringUtils.equals(user.getPasswd(), EncryptUtils.getMD5(Constant.PASSWD_PREFIX + passwd))) {
            throw new CatException("密码不正确");
        }
        return true;
    }

}
