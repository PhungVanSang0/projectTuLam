package com.example.demob1.lab2.controller;

import com.example.demob1.lab2.entity.Student;
import com.example.demob1.lab2.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService = new StudentService();

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("list", studentService.getAll());
        return "student/index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student("", "", 0, "", true));
        return "student/form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student, Model model) {
        studentService.add(student);
        return "redirect:/student/index";
    }

    @GetMapping("/update")
    public String showUpdateForm(@RequestParam String id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "student/update";
    }

    @PostMapping("/update")
    public String update(@RequestParam String id, @ModelAttribute Student student) {
        studentService.update(student);
        return "redirect:/student/index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id) {
        studentService.delete(studentService.findById(id));
        return "redirect:/student/index";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("id") String id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "student/detail";

    }
}
