package com.example.ClassManager.models;
import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
<<<<<<< HEAD
}
=======
}
>>>>>>> baf0a92eb089f91b9da0b86cb6783d432991483c
