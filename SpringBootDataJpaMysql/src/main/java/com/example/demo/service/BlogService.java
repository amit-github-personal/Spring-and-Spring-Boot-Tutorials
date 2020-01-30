package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BlogUser;

public interface BlogService {

	
	BlogUser saveInfo(BlogUser user);

	List<BlogUser> allUsers();

	void deleteBlog(Integer id);

	void deleteAllPosts();
	
}
