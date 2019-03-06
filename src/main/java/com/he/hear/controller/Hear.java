package com.he.hear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class Hear {

    @RequestMapping("/")
    public String hear(){
        return "html/hear";
    }

    @RequestMapping("/index")
    public String index(){
        return "html/index";
    }

    @RequestMapping("/index1")
    public String index1(){
        return "html/index1";
    }


    @RequestMapping("/login")
    public String login(){
        return "html/login";
    }

    @RequestMapping("/bangdan")
    public String bangdan(){
        return "html/bangdan";
    }

}
