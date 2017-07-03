package com.liuxch.observer;

public class ConcerateSubject extends Subject{
	
	private String state;
	
	public void change(String newState){
		state = newState;
		System.out.println("new state is "+state);
		this.notifyObservers(newState);
	}

}
