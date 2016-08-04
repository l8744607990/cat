package com.lius.cat.controller;

import com.dexcoder.commons.result.RunBinder;
import com.lius.cat.entity.User;
import com.lius.cat.service.UserService;
import com.lius.cat.util.GenericResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户Controller
 * User : liulu ,
 * Date : 2016-7-20 21:05 ,
 * version $Id: UserController.java, v 0.1 Exp $
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public GenericResult register (User user) {

        Boolean register = userService.register(user);
        if (RunBinder.hasErrors()) {
            return new GenericResult(false,RunBinder.getStrErrors());
        }
        return new GenericResult();

    }

    @RequestMapping("/login")
    @ResponseBody
    public GenericResult login (String phone, String passwd) {

        Boolean loginResult = userService.login(phone, passwd);

        if (RunBinder.hasErrors()) {
            return new GenericResult(false,RunBinder.getStrErrors());
        }
        return new GenericResult();
    }







}
