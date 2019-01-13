package com.azad.repo;

import com.azad.entity.TechnicalTraining;
import com.azad.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalTraiRepo extends JpaRepository<TechnicalTraining, Long> {
}
