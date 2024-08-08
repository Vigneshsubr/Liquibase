package com.liquibase.learning.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String school_name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }



}
