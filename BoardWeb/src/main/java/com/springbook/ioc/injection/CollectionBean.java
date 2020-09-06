package com.springbook.ioc.injection;

//import java.util.List;
//
//public class CollectionBean {
//	private List<String> addressList;
//	
//	public CollectionBean() {
//		System.out.println("> 객체 생성");
//	}
//	
//	public void setAddressList(List<String> addressList) {
//		System.out.println(">> setAddressList");
//		this.addressList = addressList;
//	}
//	public List<String> getAddressList() {
//		return addressList;
//	}
//}

//import java.util.Set;
//
//public class CollectionBean {
//	private Set<String> addressList;
//	
//	public CollectionBean() {
//		System.out.println("> 객체 생성");
//	}
//	
//	public void setAddressList(Set<String> addressList) {
//		System.out.println(">> setAddressList");
//		this.addressList = addressList;
//	}
//	
//	public Set<String> getAddressList() {
//		return addressList;
//	}
//}

//import java.util.Map;
//
//public class CollectionBean {
//	private Map<String, String> addressList;
//	
//	public CollectionBean() {
//		System.out.println("> 객체 생성");
//	}
//	
//	public void setAddressList(Map<String, String> addressList) {
//		System.out.println(">> setAddressList");
//		this.addressList = addressList;
//	}
//	
//	public Map<String, String> getAddressList() {
//		return addressList;
//	}
//}

import java.util.Properties; 

public class CollectionBean {
	private Properties addressList;
	
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	
	public Properties getAddressList() {
		return addressList;
	}
}