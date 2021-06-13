package com.aipalbot.carsales.webservice.model;

public class CarItem {
	private int stockId;
	private String vin; 
	private String maker;
	private double price;
	private int milleage;
	private String engine;
	private boolean status;
	private int year;
	private String imgUrl;
	


	public String getMaker() {
		return maker;
	}



	public void setMaker(String maker) {
		this.maker = maker;
	}



	public String getEngine() {
		return engine;
	}



	public void setEngine(String engine) {
		this.engine = engine;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	public void setVin(String vin) {
		this.vin = vin;
	}



	public CarItem(String vin) {
		this.vin = vin;
	}


	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMilleage() {
		return milleage;
	}
	public void setMilleage(int milleage) {
		this.milleage = milleage;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getVin() {
		return vin;
	}
	
	
}
