package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {
    @ResponseBody
    @RequestMapping("/demo")
    public String demo(){
        return "success";
    }
}
