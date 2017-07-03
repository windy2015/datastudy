package com.liuxch.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Oberserver> oberservers = new ArrayList<Oberserver>();
	
	public void attachOberver(Oberserver obs){
		System.out.println("attach a oberserver");
		oberservers.add(obs);
	}
	
	public void detachOberver(Oberserver obs){
		System.out.println("remove a oberserver");
		oberservers.remove(obs);
	}
	
	public void notifyObservers(String state){
		for(Oberserver ob : oberservers){
			ob.update(state);
		}
	}
	

}
