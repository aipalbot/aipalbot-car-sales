package com.aipalbot.carsales.webservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipalbot.carsales.webservice.entity.UserEntity;
import com.aipalbot.carsales.webservice.repository.UserRepository;
import com.aipalbot.carsales.webservice.request.UserRequest;
import com.aipalbot.carsales.webservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	//create a user
	@Override
	public void registerUser(UserRequest request) {
		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(request.getEmail());
		userEntity.setPassword(request.getPassword());
		userEntity.setRole(request.getRole());
		
		userRepository.save(userEntity);		
	}

	@Override
	public boolean deleteUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(UserRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retrieveUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
