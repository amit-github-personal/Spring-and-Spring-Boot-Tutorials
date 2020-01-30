package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Dog {
	
	public Dog()
	{
		System.out.println("Public dog invoked!");
	}
	
	public void save()
	{
		System.out.println("'Got saved from dog!");
	}

}
