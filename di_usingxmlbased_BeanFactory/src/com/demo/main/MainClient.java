package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.bean.Product;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating IOC
		Resource r = new ClassPathResource("bean.xml");
		BeanFactory f = new XmlBeanFactory(r);
		
		Product p = (Product)f.getBean("mybean");
		p.show();
		
		

	}

}
