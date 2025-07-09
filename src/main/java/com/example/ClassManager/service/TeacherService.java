// src/main/java/com/example/ClassManager/service/TeacherService.java
package com.example.ClassManager.service;

import com.example.ClassManager.models.Teacher;
import com.example.ClassManager.repositories.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Optional<Teacher> update(Long id, Teacher teacher) {
        return teacherRepository.findById(id)
                .map(existing -> {
                    existing.setName(teacher.getName());
                    return teacherRepository.save(existing);
                });
    }

    public boolean delete(Long id) {
        if (teacherRepository.existsById(id)) {
            teacherRepository.deleteById(id);
            return true;
        }
        return false;
    }
}