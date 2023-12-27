package com.ThomasTravels;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

public class Travels {
	
	public boolean isCarDriver(Driver driver) {
		
		if(driver.getDriverCatogery().equalsIgnoreCase("car")) return true;
		return false;
	}
	
	public String retrivebyDriverId(ArrayList<Driver> driverList,int driverId) {
		
		ListIterator<Driver> listIterator = driverList.listIterator();
		while(listIterator.hasNext()) {
			Driver driver = listIterator.next();
			if(driver.getDriverId()== driverId) {
				return "Driver name is "+driver.getDriverName()+" Belonging to the category "+driver.getDriverCatogery()+" traveled "+driver.getTotalDistanceTraveled()+" KM so far";
			}
		}
		return "OOPS ! ..No driver found with the given id";
	}
	
	public int retriveCountOfDriver(ArrayList<Driver> drivers,String Catogery) {
		int driverCount=0;
		for(Driver driver : drivers) {
			if(driver.getDriverCatogery().equalsIgnoreCase(Catogery)) {
				driverCount++;
			}
		}
		return driverCount;
	}
	
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> drivers,String Catogery){
		ArrayList<Driver> driversList = new ArrayList<>();
		for (Driver driver : drivers) {
			if(driver.getDriverCatogery().equalsIgnoreCase(Catogery)) {
				driversList.add(driver);
			}
		}
		return driversList;
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		Driver maxDistanceTraveleDriver = drivers.get(0);
		for (Driver driver : drivers) {
			if(driver.getTotalDistanceTraveled()>maxDistanceTraveleDriver.getTotalDistanceTraveled()) {
				maxDistanceTraveleDriver = driver;
			}
		}
		return maxDistanceTraveleDriver;
	}
}
