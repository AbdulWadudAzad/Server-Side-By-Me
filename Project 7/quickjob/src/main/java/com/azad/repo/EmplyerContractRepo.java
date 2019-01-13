package com.azad.repo;

import com.azad.entity.EmplyerContactPerson;
import com.azad.entity.Referances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplyerContractRepo extends JpaRepository<EmplyerContactPerson, Long> {
}
