package com.springbook.ioc.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.common.JDBCUtil;

import polymorphism.TV;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

//		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
//		List<String> addressList = bean.getAddressList();
//		for (String address : addressList) {
//			System.out.println(address);
//		}
		
//		Set<String> addressList = bean.getAddressList();
//		for (String address : addressList) {
//			System.out.println(address);
//		}
		
//		Map<String, String> addressList = bean.getAddressList();
//		for (String addressKey : addressList.keySet()) {
//			System.out.println(addressKey + ": " + addressList.get(addressKey).toString());
//		}
		
//		Properties addressList = bean.getAddressList();
//		for (Object name : addressList.keySet()) {
//			System.out.println(addressList.get(name).toString());
//		}
		
//		SamsungTV tv = (SamsungTV) factory.getBean("samsungTV");
//		System.out.println("price: " + tv.getPrice());
		
		
		TV tv = (TV) factory.getBean("tv");
		tv.volumeUp();
		JDBCUtil.getConnection();
		
		factory.close();
	}
}
