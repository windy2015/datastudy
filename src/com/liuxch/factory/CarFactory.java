package com.liuxch.factory;

public class CarFactory {
	
	public Car makeCar(String name){
		Car car = null;
		try {
			car = (Car) Class.forName(name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}

}
