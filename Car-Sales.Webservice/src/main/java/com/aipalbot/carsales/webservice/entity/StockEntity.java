package com.aipalbot.carsales.webservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR_STOCK_TBL")
public class StockEntity {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockId;

	@Column
	private String vin; 
	
	@Column
	private double price;
	
	@Column
	private int milleage;
	
	@Column
	private boolean status;
	
	@Column
	private String carImageUrl;
	
	@Column
	private String maker;
	
	@Column
	private String engine;

	@Column
	private int year;
	
	
	
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

	public String getCarImageUrl() {
		return carImageUrl;
	}

	public void setCarImageUrl(String carImageUrl) {
		this.carImageUrl = carImageUrl;
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

	public void setVin(String vin) {
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


	   @Override
	    public String toString() {
	        return "CarEntity [stockId=" + stockId + ", vin=" + vin + 
	                ", price=" + price + ", milleage=" + milleage   + ", status = "+status + "]";
	    }
}
