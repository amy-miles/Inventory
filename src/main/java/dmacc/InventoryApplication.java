package dmacc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Manufacturer;
import dmacc.beans.Product;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.InventoryRepository;

@SpringBootApplication
public class InventoryApplication{

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
	
	//@Autowired
	//InventoryRepository repo;
	
	/**@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//use an existing bean
		Product p = appContext.getBean("product", Product.class);
		p.setCost(2.50);
		repo.save(p);
		
		//create a bean to use - not managed by spring
		Product p2 = new Product("CrystalGloss", "Maybelline Lip Gloss", 3.0, 24);
		Manufacturer man = new Manufacturer("Test", "123 Main St", "Des Moines", "IA");
		p2.setManufacturer(man);
		repo.save(p2);
		
		List<Product> allProducts = repo.findAll();
		for (Product things: allProducts) {
			System.out.println();
		}
		
		((AbstractApplicationContext) appContext).close();
		
		
	}**/

}
