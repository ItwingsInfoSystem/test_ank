package com.outh2.integration.github_integration.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

      Student findByName(String name);

      long countById(Long id);

      boolean existsByEmail(String email);


}