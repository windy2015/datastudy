package com.liuxch.observer;

/**
 * 具体观察者
 * @author mac
 *
 */
public class ConcerateObserver implements Oberserver{
	
	private String obeseverState;

	@Override
	public void update(String state) {
		this.obeseverState = state;
		System.out.println("state is "+this.obeseverState);
	}
	

}
