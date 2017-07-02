package com.liuxch.abstractfactory;

public class ConcerateFactory2 implements AbstractProduct{

	@Override
	public ProductA getProductA() {
		return new ProductA2();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB2();
	}

}
