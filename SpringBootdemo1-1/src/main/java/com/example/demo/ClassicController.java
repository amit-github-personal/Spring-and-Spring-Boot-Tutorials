package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class ClassicController 
{
	@Autowired
	private UserService repo;
	
	@GetMapping
	public List<User> home()
	{
		return repo.findAll();
	}
	
	@GetMapping("/{name}")
	public User findbyId(@PathVariable("name") String name)
	{
		return repo.findByname(name);
	}
	
	@PostMapping
	public User createUser(User u)
	{
		return repo.save(u);
	}
	
	
	
}
