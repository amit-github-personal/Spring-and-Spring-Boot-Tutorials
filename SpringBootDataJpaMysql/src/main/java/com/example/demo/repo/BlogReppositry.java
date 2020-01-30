package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BlogUser;

public interface BlogReppositry extends JpaRepository<BlogUser, Integer> {

}
