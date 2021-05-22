package com.aipalbot.carsales.webservice.service;

import com.aipalbot.carsales.webservice.entity.UserEntity;
import com.aipalbot.carsales.webservice.request.UserRequest;

public interface UserService {
	
	void registerUser(UserRequest request);
	
	boolean deleteUser(String email);
	
	boolean updateUser(UserRequest request);
	
	UserEntity retrieveUser(String email);
	
	boolean signIn(UserRequest request);
	
}
