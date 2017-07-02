package com.liuxch.abstractfactory;

public class ConcerateFactory1 implements AbstractProduct{

	@Override
	public ProductA getProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB1();
	}

}
