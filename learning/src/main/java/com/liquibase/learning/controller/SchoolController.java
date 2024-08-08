package com.liquibase.learning.controller;

import com.liquibase.learning.entity.School;
import com.liquibase.learning.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @PostMapping("/create")
    public School createSchool(@RequestBody School school){
        return schoolService.createSchool(school);

    }
}
