package com.aipalbot.carsales.webservice.service;

import com.aipalbot.carsales.webservice.model.CarItem;
import com.aipalbot.carsales.webservice.request.CarRequest;

public interface CarService {
 
	//method signature ---- overloaded method
	String addItem(CarItem carItem);
	void addItem(CarRequest carReq);
}
