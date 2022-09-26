package com.org.tcs.service;

import com.org.tcs.model.Student;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentService {
    public void addStudent(Student student);
}
