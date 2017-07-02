package com.liuxch.abstractfactory;

public class AbstractTest {

	public static void main(String[] args) {
		ConcerateFactory1 concerateFactory1 = new ConcerateFactory1();
		concerateFactory1.getProductA().display();
		concerateFactory1.getProductB().display();

	}

}
