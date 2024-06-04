package com.example.demob1.lab1;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class bai1 {
    @RequestMapping("/lab1")
    public String form() {
        return "lab1/signup";
    }
    @RequestMapping(value = {"/lab1/signup"}, method = RequestMethod.POST)
    public String login(HttpServletRequest request){
        String age = request.getParameter("age");
        String name = request.getParameter("name");
        String adress = request.getParameter("address");
        request.setAttribute("message", "");
        if(Integer.parseInt(age) <18){
            request.setAttribute("message", "Không đủ tuổi đăng ký");
            return "lab1/signup";
        }else {
            request.setAttribute("name",name);
            request.setAttribute("age",age);
            request.setAttribute("address",adress);
        }
            return "lab1/info";
    }
}
