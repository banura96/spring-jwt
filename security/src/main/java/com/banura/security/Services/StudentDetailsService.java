package com.banura.security.Services;

import com.banura.security.DTOs.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDetailsService {

    public Student getStudentById(Integer id){
        List<Student> s = new ArrayList<>();
        s.add(new Student("Banura Hettiarachchi", 1));
        s.add(new Student("Kasun Kalhara", 2));
        s.add(new Student("Nipun Ekanayaka", 3));

        Student st = s.stream().filter(student -> student.getId().equals(id))
                .findFirst().orElseThrow(() -> new IllegalStateException("Student " + id + " does not exist"));
        return st;
    }
}
