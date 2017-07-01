package com.liuxch.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {
	
	private Map<String,String> carsMap;
	
	public Map<String, String> getCarsMap() {
		return carsMap;
	}

	public void setCarsMap(Map<String, String> carsMap) {
		this.carsMap = carsMap;
	}

	public  void read(){
		Properties p = new Properties();
		carsMap = new HashMap<String,String>();
		try {
			p.load(this.getClass().getClassLoader().getResourceAsStream("car.properties"));
			Set<Object> keys = p.keySet();
			Iterator<Object> iterator = keys.iterator();
			while(iterator.hasNext()){
				String key = (String) iterator.next();
				carsMap.put(key, p.getProperty(key));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
