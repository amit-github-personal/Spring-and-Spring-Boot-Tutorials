package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BlogUser;
import com.example.demo.repo.BlogReppositry;

@Service
public class BlogServiceImp implements BlogService{

	@Autowired
	private BlogReppositry blogRepo;
	
	@Override
	public BlogUser saveInfo(BlogUser user) {
		
		return blogRepo.save(user);
	}

	@Override
	public List<BlogUser> allUsers() {
		
		return blogRepo.findAll();
	}

	@Override
	public void deleteBlog(Integer id) {
		
		blogRepo.deleteById(id);
	}

	@Override
	public void deleteAllPosts() {
		
		blogRepo.deleteAll();
		
	}

	
	

}
