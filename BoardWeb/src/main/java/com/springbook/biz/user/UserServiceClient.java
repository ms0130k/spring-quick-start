package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService) container.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setId("testId");
		vo.setPassword("testPassword");
		
		vo = userService.getUser(vo);
		
		System.out.println(vo);
		
		container.close();
	}
}
