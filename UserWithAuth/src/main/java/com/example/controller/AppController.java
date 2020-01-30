package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/access")
public class AppController {

	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Welcome !! You re authorized To access this page .";
	}
}
