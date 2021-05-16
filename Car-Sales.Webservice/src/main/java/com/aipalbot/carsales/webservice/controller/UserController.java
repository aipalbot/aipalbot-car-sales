package com.aipalbot.carsales.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("create")
	public String addNewCustomer(@RequestBody UserRequest request) {
		
		userService.registerUser(request);
		
		return "User is created successfully!";
	}
	
}
