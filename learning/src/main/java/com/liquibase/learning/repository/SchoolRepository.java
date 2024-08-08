package com.liquibase.learning.repository;

import com.liquibase.learning.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Long> {
}
