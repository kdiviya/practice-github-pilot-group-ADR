package com.example.ClassManager.repositories;

import com.example.ClassManager.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}