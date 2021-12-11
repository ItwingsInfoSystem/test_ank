package com.outh2.integration.github_integration.repo;

import com.outh2.integration.github_integration.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

    Optional<Users> findByUsername(String username);

}
