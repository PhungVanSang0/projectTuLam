package com.example.demob1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {
    @RequestMapping("/user/form/info")
    public String info() {
        return "user/info";
    }
}
