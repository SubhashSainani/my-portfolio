package com.subhash.devfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subhash.devfolio.entity.Skill;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
    List<Skill> findByCategory(String category);
}