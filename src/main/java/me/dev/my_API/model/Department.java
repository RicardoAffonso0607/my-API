package me.dev.my_API.model;

import java.util.List;

import jakarta.persistence.*;

@Entity(name = "tb_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private List<Professor> professors;

    @OneToMany
    private List<Course> courses;

    // Methods

    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public void removeProfessor(Professor professor) {
        this.professors.remove(professor);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    // Setters and Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    
}
