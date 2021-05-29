package com.aipalbot.carsales.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aipalbot.carsales.webservice.request.UserRequest;
import com.aipalbot.carsales.webservice.service.UserService;

@RestController
@RequestMapping("user/")
public class UserController {

	@Autowired
	UserService userService;
	
	
	//ResponseEntity
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("create")
	public String addNewCustomer(@RequestBody UserRequest request) {
		
		userService.registerUser(request);
		
		return "User is created successfully!";
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("sign-in")
	public boolean signIn(@RequestBody UserRequest request) {
		
		boolean response = userService.signIn(request);
		
		return response;
	}
}
