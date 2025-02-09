package com.example.demob1.shop.controller;

import com.example.demob1.shop.entity.Catetory;
import com.example.demob1.shop.entity.Product;
import com.example.demob1.shop.repository.ProductRepo;
import com.example.demob1.shop.service.CategoryService;
import com.example.demob1.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shop/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductRepo productRepository;

    @GetMapping("/list")
    public String getListProduct(Model model) {
        model.addAttribute("list", productService.getAllProduct());
        return "shop/product/list-and-add";
    }

    @PostMapping("/add")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "redirect:/shop/product/list";
    }

    @ModelAttribute("listCategory")
    List<Catetory> getAllCategory() {
        return categoryService.getAllCategoryNonPaging();
    }

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("product", productRepository.findById(id).get());
        return "shop/product/update";
    }

    @PostMapping("/update")
    public String updateProduct(Product product) {
        productRepository.save(product);
        return "redirect:/shop/product/list";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") Integer id) {
        productRepository.deleteById(id);
        return "redirect:/shop/product/list";
    }
}
