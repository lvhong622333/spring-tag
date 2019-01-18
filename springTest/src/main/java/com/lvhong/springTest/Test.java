package com.lvhong.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		User user = (User) classPathXmlApplicationContext.getBean("testBean");
		System.out.println(user.getUserName()+":"+user.getEmail());
	}
}
