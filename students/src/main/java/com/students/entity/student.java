package com.students.entity;



import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@NoArgsConstructor

@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;
    private String rollNo;
    private String email;
    private String mobile;


    // Constructors, getters, setters, and other methods

    // You would define constructors, getters, setters, and other methods here.
    // Additionally, you can annotate fields with JPA annotations to configure
    // their mapping to database columns.
}
