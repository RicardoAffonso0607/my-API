package me.dev.my_API.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dev.my_API.model.Student;
import me.dev.my_API.repository.StudentRepository;
import me.dev.my_API.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student findById(int id) {
        return this.repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Student create(Student newStudent) {
        if (newStudent.getId() != null && this.repository.existsById(newStudent.getId())) {
            throw new IllegalArgumentException("This Student ID already exists!");
        }

        return this.repository.save(newStudent);
    }
    
}
