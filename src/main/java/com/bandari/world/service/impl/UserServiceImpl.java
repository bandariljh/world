package com.bandari.world.service.impl;

import com.bandari.world.dao.UserInfoMapper;
import com.bandari.world.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public void createUser(String tel, String password) throws Exception {
        userInfoMapper.createUser(tel,password);
    }
}
