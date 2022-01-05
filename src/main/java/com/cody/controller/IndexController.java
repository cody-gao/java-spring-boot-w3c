package com.cody.controller;

import com.cody.configure.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private HomeProperties homeProperties;

    @RequestMapping("/")
    public String indexAction(){
        String ret = homeProperties.getProvince()+"-"+homeProperties.getCity()+"-"+homeProperties.getDesc();
        return "Hello world,city config:"+ret;
    }
}
