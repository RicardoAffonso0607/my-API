package me.dev.my_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dev.my_API.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    
} 
