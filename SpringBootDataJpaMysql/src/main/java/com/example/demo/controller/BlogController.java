package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BlogUser;
import com.example.demo.service.BlogService;

@RestController
@RequestMapping(value="/blog")
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@GetMapping("/post")
	public BlogUser saveBlog()
	{
		return new BlogUser();
	}
	
	@PostMapping("/savepost")
	public BlogUser saveBloginfo(@RequestBody BlogUser user)
	{
		
		return blogService.saveInfo(user);
	}
	
	
	@GetMapping("/allusers")
	public List<BlogUser> listOfUsers()
	{
		
		return blogService.allUsers();
	}
	
	// delete a blog
	
	@DeleteMapping("/delete/{blog_id}")
	public void deleteBlog(@PathVariable("blog_id") Integer id)
	{
		blogService.deleteBlog(id);
	}
	
	// delete all
	@DeleteMapping("/delete/all")
	public void deleteAllpost()
	{
		blogService.deleteAllPosts();
	}
	
	
}
