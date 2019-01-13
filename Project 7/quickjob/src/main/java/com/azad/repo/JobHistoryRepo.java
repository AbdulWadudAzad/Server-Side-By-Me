package com.azad.repo;

import com.azad.entity.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobHistoryRepo extends JpaRepository<JobHistory, Long> {
}
