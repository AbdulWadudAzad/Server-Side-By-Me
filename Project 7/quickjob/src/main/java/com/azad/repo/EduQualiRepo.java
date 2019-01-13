package com.azad.repo;

import com.azad.entity.EduQualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduQualiRepo extends JpaRepository<EduQualification, Long> {
}
