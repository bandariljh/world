package com.bandari.world.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "rand")
public class RandomConfig {
    private String str;

    private String uuid;

    private String num;

    private String num0;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum0() {
        return num0;
    }

    public void setNum0(String num0) {
        this.num0 = num0;
    }

    @Override
    public String toString() {
        return "RandomConfig{" +
                "str='" + str + '\'' +
                ", uuid='" + uuid + '\'' +
                ", num='" + num + '\'' +
                ", num0='" + num0 + '\'' +
                '}';
    }
}
