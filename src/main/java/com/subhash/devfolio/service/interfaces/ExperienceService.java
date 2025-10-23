package com.subhash.devfolio.service.interfaces;

import java.util.List;

import com.subhash.devfolio.entity.Experience;

public interface ExperienceService {
    List<Experience> getAllWorkExperiences();

    Experience findById(Integer id);

    Experience save(Experience workExperience);

    void deleteById(Integer id);
}
