package com.subhash.devfolio.service.interfaces;

import java.util.List;

import com.subhash.devfolio.entity.Education;

public interface EducationService {
    List<Education> getAllEducationDetails();

    Education findById(int theId);

    Education save(Education theEducation);

    void deleteById(int theId);
}