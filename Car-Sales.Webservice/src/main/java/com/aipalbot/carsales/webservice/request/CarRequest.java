package com.aipalbot.carsales.webservice.request;

public class CarRequest {
	
	private String fuelType;
	private String exteriorColor;
	private int cityMPG;
	private String interiorColor;
	private int highwayMPG;
	private String stock;
	private String driveTrain;
	private String transmission;
	private String engine;
	private String vin;
	private double price;
	private int milleage;
	private boolean status;
	private String address;
	private String modelName;
	private int year;
	private String maker;
	private String imgUrl; /// AWS S3
	
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getExteriorColor() {
		return exteriorColor;
	}
	public void setExteriorColor(String exteriorColor) {
		this.exteriorColor = exteriorColor;
	}
	public int getCityMPG() {
		return cityMPG;
	}
	public void setCityMPG(int cityMPG) {
		this.cityMPG = cityMPG;
	}
	public String getInteriorColor() {
		return interiorColor;
	}
	public void setInteriorColor(String interiorColor) {
		this.interiorColor = interiorColor;
	}
	public int getHighwayMPG() {
		return highwayMPG;
	}
	public void setHighwayMPG(int highwayMPG) {
		this.highwayMPG = highwayMPG;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getDriveTrain() {
		return driveTrain;
	}
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getVin() {
		return vin;
	}
//	public void setVin(String vin) {
//		this.vin = vin;
//	}
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

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


}
