package com.subhash.devfolio.service.interfaces;

import java.util.List;

import com.subhash.devfolio.entity.Skill;

public interface SkillService {
    List<Skill> getAllSkills();

    List<Skill> getSkillsByCategory(String category);

    Skill findById(int theId);

    Skill save(Skill theEmployee);

    void deleteById(int theId);

}