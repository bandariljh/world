package com.bandari.world.controller;

import com.bandari.world.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class JDBCControllerTest {
    @Autowired
    private UserService userService;

    @Test
    public void createUser() throws Exception{
        userService.createUser("1","123456");
    }
}