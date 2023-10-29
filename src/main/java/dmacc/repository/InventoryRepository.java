package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Product;
/**
 * @author Amy Miles
 * CIS 175 - Fall 2023
 * Oct 28, 2023
 */
@Repository
public interface InventoryRepository extends JpaRepository<Product, Long> {
	/**
	 * Using interfaces give a lot of built in methods
	 * save()
	 * findAll()
	 * count()
	 * delete()
	 * findById()
	 */
}
