package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepository;


@RestController
@RequestMapping("/admin/access")
public class AdminController {

	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	@RequestMapping("/user")
	public User view()
	{
		return new User();
	}
	
	@PostMapping("/register")
	public String saveDetails(@RequestBody User user)
	{
		String pass=user.getPassword();
		user.setPassword(encoder.encode(pass));
		 userRepo.save(user);
		 return "user a";
	}
	
	
	@GetMapping("/alluser")
	public List<User> allUser()
	{
	   return userRepo.findAll();	
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user)
	{
		return userRepo.save(user);
	}
	
	@DeleteMapping("/delete/{user_id}")
	public String deleteUser(@PathVariable("id") Long id)
	{
		userRepo.deleteById(id);
		return "User deleted successfully!";
		
	}
	

	
	
	
}
