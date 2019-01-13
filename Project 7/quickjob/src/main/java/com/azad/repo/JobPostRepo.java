package com.azad.repo;

import com.azad.entity.JobPost;
import com.azad.entity.Referances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepo extends JpaRepository<JobPost, Long> {
}
