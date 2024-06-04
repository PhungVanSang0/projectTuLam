package com.example.demob1.controller;

import com.example.demob1.request.LoginRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/form")
    public String form() {
        return "user/login";
    }

    //    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if(username.equals("admin") && password.equals("123")){
//            request.setAttribute("username", username);
//            request.setAttribute("password", password);
//            return "user/info";
//        }else{
//            request.setAttribute("message", "Sai thong tin");
//            return "user/login";
//        }
//    }
//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(@RequestParam("usermane") String username,
//                        @RequestParam("password") String password,
//                        Model model){
//        if(username.equals("admin") && password.equals("123")){
//            model.addAttribute("username", username);
//            model.addAttribute("password", password);
//            return "user/info";
//        }else{
//            model.addAttribute("message", "Sai thong tin");
//            return "user/login";
//        }
//    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(LoginRequest loginRequest, Model model) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        if (username.equals("admin") && password.equals("123")) {
            model.addAttribute("username", username);
            model.addAttribute("password", password);
            return "user/info";
        }
        model.addAttribute("message", "Sai thong tin");
        return "user/login";
    }


}
