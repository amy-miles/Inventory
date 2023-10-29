package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Amy Miles
 * CIS 175 - Fall 2023
 * Oct 28, 2023
 */

/**
 * Annotations let Spring Data create the tables. 
 * If you need specific column names, columns can be mapped using the @Column(name="table_name")
 * you can map out relationships as well @OneToMany or @ManyToOne 
 * e.g. 
 * @ManyToOne
 * private ArrayList <ObjectName> objects
 * to map a datatype:
 * @Column(name= "timestamp")
 * @CreationTimestamp
 * private LocalDateTime timestamp;
 */

@Entity
@Data
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String description;
	private double cost;
	private int stock;
	@Autowired
	private Manufacturer manufacturer;

	/**
	 * @param name
	 */
	public Product(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param description
	 * @param cost
	 * @param stock
	 */
	public Product(String name, String description, double cost, int stock) {
		super();
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.stock = stock;
	}
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param cost
	 * @param stock
	 */
	public Product(long id, String name, String description, double cost, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.stock = stock;
	}

	
	
	
	
	
	
}
