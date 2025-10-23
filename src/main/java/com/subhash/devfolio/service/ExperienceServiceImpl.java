package com.subhash.devfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.subhash.devfolio.dao.ExperienceRepository;
import com.subhash.devfolio.entity.Experience;
import com.subhash.devfolio.service.interfaces.ExperienceService;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    private ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceServiceImpl(ExperienceRepository repository) {
        this.experienceRepository = repository;
    }

    @Override
    public List<Experience> getAllWorkExperiences() {
        return experienceRepository.findAllByOrderByEndDateDesc();
    }

    @Override
    public Experience findById(Integer id) {
        Optional<Experience> tempExperience = experienceRepository.findById(id);
        if(tempExperience.isPresent())
            return tempExperience.get();
        else
            throw new RuntimeException("Experience details not found in database");
    }

    @Override
    @Transactional
    public Experience save(Experience workExperience) {
        return experienceRepository.save(workExperience);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        experienceRepository.deleteById(id);
    }
}