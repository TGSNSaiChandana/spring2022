package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.Product;
//Business logic Class
// spring @confidguration annotation helps in spring based configuartion. 
//@Configuration annotation indicates that a class declares one or more @Bean methods and may
// be processed by the spring container to generate bean definitions and service requests for those beans at runtime


/*Spring @Bean Annotation is applied on a method to specify that it  
 * returns a bean to be managed by spring
 * 
 * 
 * */
@Configuration
@ComponentScan(basePackages="com.demo")
public class AppConfig {
	
	@Bean
	Product product() {
		return new Product();
	
	}

}
