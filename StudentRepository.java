package com.education.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}