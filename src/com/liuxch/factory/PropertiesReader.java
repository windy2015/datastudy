package com.liuxch.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {

	public  Map<String,String> read(){
		Properties p = new Properties();
		Map<String,String> carsMap = new HashMap<String,String>();
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
		return carsMap;
	}

}
