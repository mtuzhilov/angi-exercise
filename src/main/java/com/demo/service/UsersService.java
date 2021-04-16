package com.demo.service;

import com.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersService extends JpaRepository<Users, Integer>{
}
