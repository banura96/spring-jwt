package com.banura.security.Controllers;

import com.banura.security.DTOs.Student;
import com.banura.security.Services.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private StudentDetailsService studentDetailsService;

    @GetMapping("/student/{id}")
    public Student welcomePage(@PathVariable Integer id){
        return studentDetailsService.getStudentById(id);
    }
}
