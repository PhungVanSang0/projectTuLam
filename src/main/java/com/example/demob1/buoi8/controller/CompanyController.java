package com.example.demob1.buoi8.controller;

import com.example.demob1.buoi8.entity.AnotherCompany;
import com.example.demob1.buoi8.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    Company company;

    @Autowired
            @Qualifier("getName") //@Qualifier("bean1")
    AnotherCompany anotherCompany;

    @GetMapping("/company")
    @ResponseBody
    public String getName(){
        return company.getName();
    }
    @GetMapping("/anotherCompany")
    @ResponseBody
    public String getAnotherName(){
        return anotherCompany.getName();
    }


}
