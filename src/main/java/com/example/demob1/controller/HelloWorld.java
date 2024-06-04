package com.example.demob1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "helloworld";
    }




}
