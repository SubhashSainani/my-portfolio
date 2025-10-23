package com.subhash.devfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subhash.devfolio.entity.Experience;

import java.util.List;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

    public List<Experience> findAllByOrderByEndDateDesc();
}
