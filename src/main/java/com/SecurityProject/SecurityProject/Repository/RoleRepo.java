package com.SecurityProject.SecurityProject.Repository;

import com.SecurityProject.SecurityProject.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

