package com.zixcloudfoundary.messagingwsapplication.service.ui.requests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class RequestHandler {
	
	@GetMapping
	public String startupServerContextReponse()
	{
		return "The server has requested the context Path";
	}
	
	@PostMapping
	public String postEndPoint(String message)
	{
		return message+": was send to service end point";
	}
	

}
