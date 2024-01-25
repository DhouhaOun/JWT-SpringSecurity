package com.example.demo.serc.repo;

import com.example.demo.serc.entities.AppRole;
import com.example.demo.serc.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository <AppRole,Long>{
    AppRole findByRoleName(String roleName);
}
