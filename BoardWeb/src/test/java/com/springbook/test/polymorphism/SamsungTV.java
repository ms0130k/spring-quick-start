package com.springbook.test.polymorphism;

public class SamsungTV implements TV{

	@Override
	public void turnOn() {
		System.out.println("turn on Samsung");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off Samsung");
	}
	
}
