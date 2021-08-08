package com.banura.security.Controllers;

import com.banura.security.DTOs.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/mng")
public class StudentManagementController {

    private List<Student> Stu = new ArrayList<>();

    @GetMapping("/student")
    public List<Student> getStudents(){
        Stu.add(new Student("Banura", 1));
        System.out.println(Stu.get(0));
        return Stu;
    }

    @PostMapping("/student")
    public String addNewStudent(@RequestBody Student student) throws Exception{
        if(student != null){
            Stu.add(student);
        }
        return "Adding Successfully";
    }

    @DeleteMapping("/student/{id}")
    public Integer deleteStudent(@PathVariable("id") Integer id){
        Stu.removeIf(s ->s.getId().equals(id));
        return id;
    }
}
