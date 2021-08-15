package com.aipalbot.carsales.webservice.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipalbot.carsales.webservice.entity.CustomerEntity;
import com.aipalbot.carsales.webservice.repository.CustomerRepository;
import com.aipalbot.carsales.webservice.request.CustomerRequest;
import com.aipalbot.carsales.webservice.service.CustomerService;
import com.aipalbot.carsales.webservice.util.CommonUtil;

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
		
		customerEntity.setCustomerId(CommonUtil.generateNumber());
		customerEntity.setFirstName(request.getFirstName());
		customerEntity.setLastName(request.getLastName());
		customerEntity.setPhoneNumber(request.getPhoneNumber());

		customerRepository.save(customerEntity);
		
		return customerEntity.getCustomerId();
	}

	@Override
	public CustomerEntity retrieveCustomer(String email) {
		CustomerEntity entity = customerRepository.findByCustomerEmail(email);
		return entity;
	}

	@Override
	public boolean updateCustomer(CustomerRequest request) {
		
		try {
		CustomerEntity existingCustomer = retrieveCustomer(request.getCustomerEmail());
		existingCustomer.setAddress(request.getAddress());
		existingCustomer.setState(request.getState());
		existingCustomer.setCity(request.getCity());
		existingCustomer.setZipCode(request.getZipCode());
		
		customerRepository.save(existingCustomer);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public CustomerEntity retrieveCustomerByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
