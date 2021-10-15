package com.SecurityProject.SecurityProject.Repository;

import com.SecurityProject.SecurityProject.Models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
