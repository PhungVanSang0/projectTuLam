package com.example.demob1.buoi56.controller;

import com.example.demob1.buoi56.entity.Country;
import com.example.demob1.buoi56.entity.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @GetMapping("/form")
    public String ShowForm(Model model) {
        model.addAttribute("staff", new Staff());
        return "staff/staff";
    }

    @ModelAttribute("positions")
    public Map<String,String> getPositions(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("sv","Sinh Vien");
        map.put("gv","Giao Vien");
        map.put("gd","Giam doc");
        return map;
    }

    @ModelAttribute("hobies")
    public String[] getHobby(){
        String[] list = {"an", "choi", "hoc"};
        return list;
    }

    @ModelAttribute("countries")
    public List<Country> getCountries(){
        List<Country> list = new ArrayList<>();
        list.add(new Country("vn","Viet Nam"));
        list.add(new Country("cn","Trung Quoc"));
        list.add(new Country("usa","My"));
        return list;
    }

    @PostMapping("/form")
    public String Save(@ModelAttribute("staff") Staff staff,Model model){
        model.addAttribute("message","Luu thanh cong");
        return "staff/staff";
    }
}
