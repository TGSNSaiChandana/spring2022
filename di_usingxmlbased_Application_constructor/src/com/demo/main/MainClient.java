package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Product;
import com.demo.config.AppConfig;
import com.demo.service.ProductDetails;
import com.demo.service.ProductServiceImpl;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Product p = (Product)c.getBean(Product.class);

		/*p.setName("MI");
		p.setColor("red");
		p.setId(101);*/
		
		Product record1 = new Product(101,"Samsung","black");
		Product record2 = new Product(102,"Redmi","Pink");

		record1.show();
		record2.show();

		
		//p.show();
		
		//ProductDetails productDetails = new ProductServiceImpl();
		//productDetails.showProductDetails();
		

	}

}
