package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Manufacturer;
import dmacc.beans.Product;

/**
 * @author Amy Miles
 * CIS 175 - Fall 2023
 * Oct 28, 2023
 */
@Configuration
public class BeanConfiguration {
	

	@Bean
	public Product product() {
		Product bean = new Product();
		
		return bean;
	}
	
	@Bean
	public Manufacturer manufacturer() {
		Manufacturer bean = new Manufacturer();
		return bean;
	}
	
}
