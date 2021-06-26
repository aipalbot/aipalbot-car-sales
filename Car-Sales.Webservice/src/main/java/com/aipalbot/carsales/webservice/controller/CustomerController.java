package com.aipalbot.carsales.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.carsales.webservice.request.CustomerRequest;
import com.aipalbot.carsales.webservice.service.CustomerService;

@RestController
@RequestMapping("customer/")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("new")
	public String addNewCustomer(@RequestBody CustomerRequest request) {
		
		int customerId = customerService.addCustomer(request);
		
		return "Customer Id: " + customerId + ", saved successfully";
	}

	
}
