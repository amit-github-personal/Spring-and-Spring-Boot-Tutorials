package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Service.UserService;

@Controller("/")
public class ClassicController {
	
	@Autowired
	private UserService repo;
	
	@ResponseBody
	@RequestMapping(path="/user",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers()
	{
		return repo.findAll();
	}
	@ResponseBody
	@RequestMapping(path="/user",method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public User createUser(@RequestBody User u)
	{
		return  repo.save(u);
	}
	
	

}
