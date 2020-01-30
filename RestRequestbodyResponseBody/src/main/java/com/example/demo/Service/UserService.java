package com.example.demo.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.User;

public interface UserService extends JpaRepository<User, Long>{

}
