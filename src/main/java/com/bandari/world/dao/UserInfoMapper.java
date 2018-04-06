package com.bandari.world.dao;

public interface UserInfoMapper {
    /**
     * 创建用户信息
     * @param tel
     * @param pwd
     */
    void createUser(String tel, String pwd);
}
