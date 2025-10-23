package com.subhash.devfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subhash.devfolio.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
}