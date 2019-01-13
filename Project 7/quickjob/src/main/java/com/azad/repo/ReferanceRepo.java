package com.azad.repo;

import com.azad.entity.Referances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferanceRepo extends JpaRepository<Referances, Long> {
}
