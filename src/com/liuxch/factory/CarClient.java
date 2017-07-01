package com.liuxch.factory;

import java.util.Map;

public class CarClient {
	
	public static String BENZ_CAR_NAME = "Benz";
	
	public static String BMW_CAR_NAME = "Bmw";

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
        PropertiesReader pr = new PropertiesReader();
        pr.read();
        Map<String,String> carsMap = pr.getCarsMap();
        
        Car car1 = factory.makeCar(carsMap.get(BENZ_CAR_NAME));
        car1.make();
        
        Car car2 = factory.makeCar(carsMap.get(BMW_CAR_NAME));
        car2.make();
        
	}

}
