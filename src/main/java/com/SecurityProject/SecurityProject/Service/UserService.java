package com.SecurityProject.SecurityProject.Service;

import com.SecurityProject.SecurityProject.Models.AppUser;
import com.SecurityProject.SecurityProject.Models.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser>getAllUsers();
}
