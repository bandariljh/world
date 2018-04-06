package com.bandari.world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hi")
public class WelcomeToBandarisWorld {
    @RequestMapping(value = "/hi",method =  RequestMethod.GET)
    public String getBandariName() {
        return "Welcome to Bandari's world!";
    }
}
