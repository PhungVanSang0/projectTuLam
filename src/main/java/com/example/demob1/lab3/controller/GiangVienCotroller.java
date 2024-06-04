package com.example.demob1.lab3.controller;

import com.example.demob1.lab2.entity.Student;
import com.example.demob1.lab3.entity.GiangVien;

import com.example.demob1.lab3.service.GiangVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/giang-vien")
public class GiangVienCotroller {
    GiangVienService giangVienService = new GiangVienService();
    @GetMapping("hien-thi")
    public String index(Model model){
        model.addAttribute("list",giangVienService.getAll());
        return "giangVien/hien-thi";
    }

//    @GetMapping("/search")
//    public String searchGiangVien(@RequestParam String id, Model model) {
//        GiangVien gv = GiangVienService.
//        model.addAttribute("giangVienList", );
//        return "index";
//    }
//
//    @GetMapping("/giang-vien-nu")
//    public String hienThiGiangVienNu(Model model) {
//        model.addAttribute("giangVienList", giangVienService.searchGiangVienNu());
//        return "index";
//    }

    @GetMapping("/delete")
    public String deleteGiangVien(@RequestParam("id") String id) {
        giangVienService.delete(giangVienService.findById(id));
        return "redirect:/giang-vien/hien-thi";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("giangVien", new GiangVien("", "","" ,0, true, ""));
        return "giangVien/form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute GiangVien giangVien, Model model) {
        giangVienService.add(giangVien);
        return "redirect:/giang-vien/hien-thi";
    }

    @GetMapping("/update")
    public String showUpdateForm(@RequestParam String id, Model model) {
        GiangVien giangVien = giangVienService.findById(id);
        model.addAttribute("giangVien", giangVien);
        return "giangVien/update";
    }

    @PostMapping("/update")
    public String update(@RequestParam String id, @ModelAttribute GiangVien giangVien) {
        giangVienService.update(giangVien);
        return "redirect:/giangVien/hien-thi";
    }
}
