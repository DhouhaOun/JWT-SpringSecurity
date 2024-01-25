package com.example.demo.serc.repo;

import com.example.demo.serc.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository <AppUser,Long>{
    AppUser findByUserName(String userName);
}
