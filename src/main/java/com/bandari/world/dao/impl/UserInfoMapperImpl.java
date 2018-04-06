package com.bandari.world.dao.impl;

import com.bandari.world.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoMapperImpl implements UserInfoMapper{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createUser(String tel, String pwd) {
        jdbcTemplate.update("INSERT INTO game.game_user_login_info(id,password,username,age,sex) VALUES (?,md5(?),?,?,?)",tel,pwd,"刘建华","26","男");
    }
}
