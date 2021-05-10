package com.aipalbot.carsales.webservice.model;

public class CarItem {
	private int stockId;
	private String vin; 
	private double price;
	private int milleage;
	private boolean status;
	


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
