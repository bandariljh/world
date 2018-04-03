package com.bandari.world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToBandarisWorld {
    @RequestMapping(value = "/hi",method =  RequestMethod.POST)
    public String getBandariName() {
        return "Welcome to Bandari's world!";
    }
}
