package com.org.tcs.controller;

import com.org.tcs.model.Student;
import com.org.tcs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
  @Autowired
  StudentService studentService;
  //CRUD//
    @PostMapping("/create")
    public void addStudent(@RequestBody Student student){
      studentService.addStudent(student);

    }

}
