package com.example.demob1.shop.controller;

import com.example.demob1.shop.entity.Catetory;
import com.example.demob1.shop.repository.CatetoryRepo;
import com.example.demob1.shop.service.CategoryService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@RequestMapping("/shop/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    CatetoryRepo catetoryRepo;

    @GetMapping("/list")
    public String showList(Model model
            , @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", categoryService.getAllCategory(p));
        return "shop/category";
    }

    @PostMapping ("/add")
    public String addCategory(Catetory catetory){
        categoryService.addCategory(catetory);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/delete")
    public String deleteCategory(@RequestParam("id") String id) {
        categoryService.deleteCategoryById(id);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/detail/{id}")
    public String detailCategory(@PathVariable("id") String id,Model model) {
        model.addAttribute("category", categoryService.getCateById(id));
        return "shop/categoryDetail";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdateCategory(Model model,@PathVariable("id") String id){
        model.addAttribute("category",categoryService.getCateById(id));
        return "shop/categoryUpdate";
    }

    @PostMapping("/update")
    public String UpdateCategory(Catetory catetory){
        categoryService.updateCategory(catetory);
        return "redirect:/shop/category/list";
    }

    @ResponseBody
    @GetMapping("/findByName")
    public Catetory findByName(@RequestParam("name") String name){
        return catetoryRepo.findCatetoryByName(name);
    }

    @ResponseBody
    @GetMapping("/findCategoryJPQL")
    public Catetory findCategoryJPQL(@RequestParam("name") String name){
        return catetoryRepo.findCatetoryByNameJpql(name);
    }

    @ResponseBody
    @GetMapping("/findCategorySQL")
    public Catetory findCategorySQL(@RequestParam("name") String name){
        return catetoryRepo.findCatetoryByNameJpql(name);
    }
}
