package com.springbook.test.polymorphism;

public class TVUserTestDrive {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);
		tv.turnOn();
		tv.turnOff();
	}
}
