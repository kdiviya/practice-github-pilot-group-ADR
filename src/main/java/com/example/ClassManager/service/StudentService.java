package com.example.ClassManager.service;

import com.example.ClassManager.models.Student;
<<<<<<< HEAD
import com.example.ClassManager.repositories.StudentRepository;
=======
import com.example.ClassManager.repository.StudentRepository;
>>>>>>> baf0a92eb089f91b9da0b86cb6783d432991483c
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> update(Long id, Student student) {
        return studentRepository.findById(id)
                .map(existing -> {
                    existing.setName(student.getName());
                    return studentRepository.save(existing);
                });
    }

    public boolean delete(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}