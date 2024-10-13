package me.dev.my_API.service;

import me.dev.my_API.model.Student;

public interface StudentService {

    public Student findById(int id);
    
    public Student create(Student student);
}
