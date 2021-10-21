package com.SecurityProject.SecurityProject.repository;

import com.SecurityProject.SecurityProject.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

