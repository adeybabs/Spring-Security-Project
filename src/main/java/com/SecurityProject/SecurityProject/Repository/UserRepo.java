package com.SecurityProject.SecurityProject.repository;

import com.SecurityProject.SecurityProject.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
