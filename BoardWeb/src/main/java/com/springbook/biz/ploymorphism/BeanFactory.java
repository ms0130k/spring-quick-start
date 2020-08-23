package com.springbook.biz.ploymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.contentEquals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
