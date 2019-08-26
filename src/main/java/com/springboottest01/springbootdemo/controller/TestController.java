package com.springboottest01.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("/testDemo1")
    @ResponseBody
    public Object test(){
        return "This is a demo!";
    }

    @RequestMapping("/demo2")
    public String test1(){
        return "hello";
    }

}
