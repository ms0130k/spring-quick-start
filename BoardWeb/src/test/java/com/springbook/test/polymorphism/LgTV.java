package com.springbook.test.polymorphism;

public class LgTV implements TV{

	@Override
	public void turnOn() {
		System.out.println("turn on Lg");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off Lg");
	}
	
}
