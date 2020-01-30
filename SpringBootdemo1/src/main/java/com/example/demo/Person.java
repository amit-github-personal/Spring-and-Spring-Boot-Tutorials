package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Person {
	
	@Autowired
	private Dog dog;
	
	
	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Person()
	{
		System.out.println("Person constructor invoked");
	}
	
	public void print()
	{
		System.out.println("Mean Perosn");
		dog.save();
	}

}
