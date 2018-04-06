package com.bandari.world.controller;

import com.bandari.world.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JDBCController {
    @Autowired
    private UserService userService;

    /**
     *添加用户
     * @param tel 注册手机号
     * @param pwd 密码
     * @throws Exception
     */
    /*
    @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
    @PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。
    */
    @RequestMapping(value="/createUser", method = RequestMethod.POST)
    public void createUser(@RequestParam("tel") String tel, @RequestParam("pwd") String pwd) throws Exception{
        userService.createUser(tel,pwd);
    }
}
