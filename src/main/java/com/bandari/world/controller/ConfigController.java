package com.bandari.world.controller;

import com.bandari.world.entity.RandomConfig;
import com.bandari.world.entity.ZZPProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    //方式一: 直接通过@Value获取配置Value
//    @Value("${zzp.name}")
//    private String name;
//
//    @Value("${zzp.age}")
//    private  String age;
//
//    @Value("${zzp.height}")
//    private String height;
    //方式二:通过实体类获得配置信息
    @Autowired
    private ZZPProperties zzpProperties;
    @Autowired
    private RandomConfig randomConfig;

    @RequestMapping(value="/zzp", method = RequestMethod.GET)
    public ZZPProperties getZZPInfo() {
//        return "zzp.name :" + name + "zzp.age :"+ age + "zzp.height :" + height;
        return zzpProperties;
    }

    @RequestMapping(value="/rand", method = RequestMethod.GET)
    public RandomConfig getRandomConfig() {
        return randomConfig;
    }
}
