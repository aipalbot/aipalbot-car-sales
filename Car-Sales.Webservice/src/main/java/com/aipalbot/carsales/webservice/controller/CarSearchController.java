package com.aipalbot.carsales.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.carsales.webservice.entity.StockEntity;
import com.aipalbot.carsales.webservice.service.CarService;

@RestController
@RequestMapping("search/")
public class CarSearchController {

	@Autowired
	CarService carService;
	
	
	@GetMapping("items/below")
	public List<StockEntity> getAllItemsBelow(@RequestParam("price") double price ){
	
		List<StockEntity> carsBelowPrice = carService.retrieveCarsBelowPrice(price);
		
		return carsBelowPrice;
	}

	@GetMapping("items/range")
	public List<StockEntity> getAllItemsBetween(@RequestParam("startPrice") double startPrice,@RequestParam("endPrice") double endPrice )
	{
	
		List<StockEntity> carsBelowPrice = carService.retrieveCarsByPriceRange(startPrice, endPrice);
		
		return carsBelowPrice;
	}
}
