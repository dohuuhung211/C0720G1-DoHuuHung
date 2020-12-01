package com.baitap.controller;

import com.baitap.model.Student;
import com.baitap.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public String getAllStudent(Model model){
        model.addAttribute("studentList", studentService.getAllStudent());
        return "list_student";
    }
    @GetMapping("/detail")
    public String getDetailStudent(@RequestParam int id, Model model){
        model.addAttribute("studentDetail", studentService.findById(id-1));
        return "detail_student";
    }
    @GetMapping("/create")
    public String goCreatePage(Model model){
        model.addAttribute("student", new Student());
        return "create_student";
    }
    @PostMapping("/create")
    public String addNewStudent(@ModelAttribute Student student, Model model, RedirectAttributes redirectAttributes){
        this.studentService.addStudent(student);
        redirectAttributes.addFlashAttribute("message","successfully!");
        return "redirect:/student";
    }
}
