package com.lius.cat;

import com.lius.cat.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Write comment here
 * User : liulu ,
 * Date : 2016-7-20 20:55 ,
 * version $Id: UserServiceImplTest.java, v 0.1 Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserService userService;


}