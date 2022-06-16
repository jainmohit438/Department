package com.Record.Department.repository;

import com.Record.Department.entity.Course;
import com.Record.Department.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courses=
                courseRepository.findAll();
        System.out.println(courses);
    }
    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher=Teacher.builder()
                .firstName("Ajay")
                .lastName("jain")
                .build();

        Course course=Course
                .builder()
                .title("Python")
                .credit(3)
                .teacher(teacher)
                .build();
        courseRepository.save(course);
    }
}