package com.ThomasTravels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDriver {

	public static void main(String[] args) {
		
		Driver d1 = new Driver();
		d1.setDriverId(202301);
		d1.setDriverName("Aravind");
		d1.setDriverCatogery("Car");
		d1.setTotalDistanceTraveled(2390);
		
		Driver d2 = new Driver();
		d2.setDriverId(202302);
		d2.setDriverName("Prabha");
		d2.setDriverCatogery("car");
		d2.setTotalDistanceTraveled(3898);
		
		Driver d3 = new Driver();
		d3.setDriverId(202303);
		d3.setDriverName("Sandeep");
		d3.setDriverCatogery("Lorry");
		d3.setTotalDistanceTraveled(3450);
		
		ArrayList<Driver> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		Travels travels = new Travels();
		/*
		 * boolean carDriver = travels.isCarDriver(d1); if (carDriver) {
		 * System.out.println(d1.getDriverName()+" is Car Driver"); } else {
		 * System.out.println(d1.getDriverName()+" is Not Car Driver"); }
		 * 
		 * String retrivebyDriverId = travels.retrivebyDriverId(list, 202302);
		 * System.out.println(retrivebyDriverId);
		 */
		
		/*
		 * int retriveCountOfDriver = travels.retriveCountOfDriver(list, "car");
		 * System.out.println("Lorry Driver Count "+ retriveCountOfDriver);
		 */
		
		/*
		 * ArrayList<Driver> retriveDriver = travels.retriveDriver(list, "lorry"); for
		 * (Driver driver : retriveDriver) { System.out.println(driver.getDriverName());
		 * }
		 */
		
		Driver retriveMaximumDistanceTravelledDriver = travels.retriveMaximumDistanceTravelledDriver(list);
		System.out.println(retriveMaximumDistanceTravelledDriver.getDriverName());
	}
}
