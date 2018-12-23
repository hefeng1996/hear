package com.he.hear.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestControl {

    @RequestMapping("index")
    public String index(){
        return "/html/index";
    }

}
