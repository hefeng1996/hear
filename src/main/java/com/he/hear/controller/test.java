package com.he.hear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("test")
@Controller
public class test{

    @RequestMapping("hear")
    public String hear(){
        return "html/hear";
    }



}
