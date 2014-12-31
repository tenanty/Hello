package com.channelsoft.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuanshun on 2014/12/31.
 */
@Controller
@RequestMapping(value = "/hello")
public class MyController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(){

        return "hello";
    }

}
