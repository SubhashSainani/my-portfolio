package com.subhash.devfolio.service.interfaces;

import java.util.List;

import com.subhash.devfolio.entity.Project;

public interface ProjectService {
    List<Project> getAllProjects();

    Project findById(Integer id);

    Project save(Project project);

    void deleteById(Integer id);
}