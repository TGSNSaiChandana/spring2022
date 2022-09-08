package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Product;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating IOC
		ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
		
		Product p = (Product)c.getBean("mybean");
		p.show();
		
		

	}

}
