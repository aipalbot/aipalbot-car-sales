package com.aipalbot.carsales.webservice.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipalbot.carsales.webservice.entity.CustomerEntity;
import com.aipalbot.carsales.webservice.repository.CustomerRepository;
import com.aipalbot.carsales.webservice.request.CustomerRequest;
import com.aipalbot.carsales.webservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	Random rand = new Random();

	// Obtain a number between [0 - 49].

	@Override
	public int addCustomer(CustomerRequest request) {
	
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setAddress(request.getAddress());
		customerEntity.setCustomerEmail(request.getCustomerEmail());
		int n = rand.nextInt(5000000);
		customerEntity.setCustomerId(n);
		customerEntity.setFirstName(request.getFirstName());
		customerEntity.setLastName(request.getLastName());
		customerEntity.setPhoneNumber(request.getPhoneNumber());

		customerRepository.save(customerEntity);
		
		return customerEntity.getCustomerId();
	}

}
