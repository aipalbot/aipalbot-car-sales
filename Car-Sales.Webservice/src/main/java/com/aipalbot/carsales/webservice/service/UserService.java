package com.aipalbot.carsales.webservice.service;

import com.aipalbot.carsales.webservice.request.UserRequest;

public interface UserService {
	
	void registerUser(UserRequest request);
	
	boolean deleteUser(String email);
	
	boolean updateUser(UserRequest request);
	
	boolean retrieveUser(String email);
	
}
