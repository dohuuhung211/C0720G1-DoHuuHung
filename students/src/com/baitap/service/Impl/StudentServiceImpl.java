package com.baitap.service.Impl;

import com.baitap.model.Student;
import com.baitap.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private static List<Student> studentList;
    static {
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Hung", "22/11/1995"));
        studentList.add(new Student(2, "Khanh", "22/11/1995"));
        studentList.add(new Student(3, "Hao", "22/11/1995"));
        studentList.add(new Student(4, "Viet", "22/11/1995"));
    }
    @Override
    public List<Student> getAllStudent() {
        return studentList;
    }

    @Override
    public Student findById(int id) {
        return studentList.get(id);
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

}
