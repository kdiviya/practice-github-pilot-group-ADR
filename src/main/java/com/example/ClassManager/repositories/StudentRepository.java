package com.example.ClassManager.repository;

import com.example.ClassManager.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
