package com.springbook.biz.ploymorphism;

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
