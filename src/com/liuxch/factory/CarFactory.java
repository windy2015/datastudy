package com.liuxch.factory;

import java.util.Map;

public class CarFactory {
	
	public Car makeCar(String name){
		Car car = null;
		Map<String,String> carsMap = new PropertiesReader().read();
		//获取包的全路径名
		String fullName = carsMap.get(name);
		try {
			car = (Car) Class.forName(fullName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}

}
