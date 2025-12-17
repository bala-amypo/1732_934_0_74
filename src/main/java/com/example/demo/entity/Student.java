package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "students") // Explicit table naming is a best practice
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Ensures name cannot be null
    private String name;

    @Column(unique = true, nullable = false) // Prevents duplicate emails
    private String email;

    private LocalDate dob;
    private float cgpa;

    // MANDATORY: No-argument constructor required by JPA
    public Student() {
    }

    // RECOMMENDED: Parameterized constructor for easy instantiation
    public Student(String name, String email, LocalDate dob, float cgpa) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.cgpa = cgpa;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public float getCgpa() { return cgpa; }
    public void setCgpa(float cgpa) { this.cgpa = cgpa; }
}
