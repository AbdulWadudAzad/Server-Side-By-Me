package com.azad.repo;

import com.azad.entity.Privilize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrivilizeRepo extends JpaRepository<Privilize, Long> {
    Privilize findByPrivilizeName(String privilizeName);


}
