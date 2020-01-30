package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=userRepo.findByUserName(username);
		
		UserDetailsCustom userDetails=null;
	     if(user!=null) {
	    	 userDetails=new UserDetailsCustom();
	    	 userDetails.setUser(user);
	     }
	     else
	     {
	    	 throw new UsernameNotFoundException("User not exist"+username);
	     }
		
		return null;
	}
	
	
	
}
