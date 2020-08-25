package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		System.out.println("> start");
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV) factory.getBean(args[0]);
//		TV tv = (TV) factory.getBean("samsung");
//		tv.turnOn();
//		tv.turnOff();
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV) factory.getBean("tv");
		tv.volumeUp();
		
		factory.close();
		System.out.println("> end");
	}
}
