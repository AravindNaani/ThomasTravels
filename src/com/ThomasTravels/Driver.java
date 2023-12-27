package com.ThomasTravels;

public class Driver {
	
	private long driverId;
	
	private String driverName;
	
	private String driverCatogery;
	
	private double totalDistanceTraveled;

	public Driver(int driverId, String driverName, String driverCatogery, double totalDistanceTraveled) {
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverCatogery = driverCatogery;
		this.totalDistanceTraveled = totalDistanceTraveled;
	}
	
	public Driver() {
		
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverCatogery() {
		return driverCatogery;
	}

	public void setDriverCatogery(String driverCatogery) {
		this.driverCatogery = driverCatogery;
	}

	public double getTotalDistanceTraveled() {
		return totalDistanceTraveled;
	}

	public void setTotalDistanceTraveled(double totalDistanceTraveled) {
		this.totalDistanceTraveled = totalDistanceTraveled;
	}
	
}
