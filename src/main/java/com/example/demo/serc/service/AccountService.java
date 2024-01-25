package com.example.demo.serc.service;

import com.example.demo.serc.entities.AppRole;
import com.example.demo.serc.entities.AppUser;

import java.util.List;

public interface AccountService   {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();

}
