package com.liquibase.learning.service;

import com.liquibase.learning.entity.School;
import com.liquibase.learning.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }
}
