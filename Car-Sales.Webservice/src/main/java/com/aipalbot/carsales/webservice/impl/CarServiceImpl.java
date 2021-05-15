package com.aipalbot.carsales.webservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipalbot.carsales.webservice.entity.StockEntity;
import com.aipalbot.carsales.webservice.model.CarItem;
import com.aipalbot.carsales.webservice.repository.CarRepository;
import com.aipalbot.carsales.webservice.request.CarRequest;
import com.aipalbot.carsales.webservice.service.CarService;

@Service
public class CarServiceImpl implements  CarService{

	//inheritance --- 
	//DI - Dependency Injection --- @Autowired
	@Autowired
	CarRepository carRepository;
	
	@Override
	public String addItem(CarItem carItem) {
		StockEntity entity = new StockEntity();
		entity.setMilleage(carItem.getMilleage());
		entity.setPrice(carItem.getPrice());
		entity.setStatus(carItem.isStatus());
		entity.setVin(carItem.getVin());
		
		//save to the h2 database
		carRepository.save(entity);
		
		return "Successfully saved!";
	}

	@Override
	public void addItem(CarRequest carReq) {
		// TODO Auto-generated method stub
		
	}

//Types of DI
	//constructor injection
	//setter injection
	//method injection
//Overriding methods will be excluded until we do Inheritance.
}
