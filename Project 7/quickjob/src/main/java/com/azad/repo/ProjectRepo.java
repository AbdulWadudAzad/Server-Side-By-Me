package com.azad.repo;

import com.azad.entity.Project;
import com.azad.entity.Referances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
}
