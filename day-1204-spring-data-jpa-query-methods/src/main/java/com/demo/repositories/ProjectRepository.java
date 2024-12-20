package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
