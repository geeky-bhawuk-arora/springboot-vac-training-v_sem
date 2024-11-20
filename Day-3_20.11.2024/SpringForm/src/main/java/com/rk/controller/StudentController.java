package com.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rk.dao.StudentDAO;
import com.rk.model.Student;

@Controller
public class StudentController {
	
	@Autowired
    private StudentDAO studentDAO;
	
	@GetMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@PostMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student, Model model) {
        int result = studentDAO.saveStudent(student);

        if (result > 0) {
            model.addAttribute("message", "Form submitted successfully!");
        } else {
            model.addAttribute("message", "Form submission failed.");
        }

        return "form-success";
	}


}
