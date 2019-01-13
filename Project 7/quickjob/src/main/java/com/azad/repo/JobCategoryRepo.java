package com.azad.repo;



import com.azad.entity.JobCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobCategoryRepo extends JpaRepository<JobCategory,Long> {
    JobCategory findByTypeName (String jobCategory);
}
