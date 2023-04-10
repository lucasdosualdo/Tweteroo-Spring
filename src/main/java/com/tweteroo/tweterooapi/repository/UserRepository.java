package com.tweteroo.tweterooapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.tweterooapi.models.UserApplication;

@Repository
public interface UserRepository extends JpaRepository<UserApplication, Long>{
   Optional<UserApplication> findByUsername(String username);
}
