package com.baitap.service;

import com.baitap.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student findById(int id);
    void addStudent(Student student);
}
