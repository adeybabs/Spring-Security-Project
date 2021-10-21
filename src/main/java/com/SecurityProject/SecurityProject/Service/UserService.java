package com.SecurityProject.SecurityProject.service;

import com.SecurityProject.SecurityProject.models.AppUser;
import com.SecurityProject.SecurityProject.models.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser>getAllUsers();
}
