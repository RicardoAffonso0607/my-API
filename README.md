# Java RESTful API made with Spring Boot

This project 

## Diagram

```mermaid
classDiagram
    class University {
        -String name
        -String location
        -List<Department> departments
        +addDepartment(Department department)
        +removeDepartment(Department department)
    }

    class Department {
        -String name
        -List<Course> courses
        -List<Professor> professors
        +addCourse(Course course)
        +removeCourse(Course course)
        +addProfessor(Professor professor)
        +removeProfessor(Professor professor)
    }

    class Course {
        -String name
        -String code
        -List<Student> students
        +addStudent(Student student)
        +removeStudent(Student student)
    }

    class Student {
        -String name
        -List<Course> courses
        +addCourse(Course course)
        +removeCourse(Course course)
    }

    class Professor {
        -String name
        -List<Course> courses
        -Department department
        +addCourse(Course course)
        +removeCourse(Course course)
    }

    University "1" *-- "0..*" Department : has
    Department "1" o-- "0..*" Course : offers
    Department "1" o-- "0..*" Professor : employs
    Course "0..*" o-- "0..*" Student : enrolls
    Professor "1" o-- "0..*" Course : teaches
```