package com.example.demob1.buoi8.controller;

import com.example.demob1.buoi8.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/getEmployee")
    public String getEmployee(Model model){
        model.addAttribute("employee",service.getEmployees());
        return "buoi8/table";
    }
}
