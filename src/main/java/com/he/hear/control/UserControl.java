package com.he.hear.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserControl {

    @RequestMapping("index")
    public String index(){

        return "/html/index";
    }

    @RequestMapping("toLogin")
    public String toLogin(){
        return "html/login";
    }

    @RequestMapping("toRegister")
    public String toRegister(){
        return "html/register";
    }



}
