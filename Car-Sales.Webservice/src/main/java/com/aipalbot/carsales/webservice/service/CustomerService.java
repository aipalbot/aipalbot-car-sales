package com.aipalbot.carsales.webservice.service;

import com.aipalbot.carsales.webservice.entity.CustomerEntity;
import com.aipalbot.carsales.webservice.request.CustomerRequest;

public interface CustomerService {

	int addCustomer(CustomerRequest request);
	CustomerEntity retrieveCustomer(String email);
	boolean updateCustomer(CustomerRequest request);
	CustomerEntity retrieveCustomerByPhone(String phone);
}
