package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Product;
import dmacc.repository.InventoryRepository;

@Controller
public class WebController {
	@Autowired
	InventoryRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllProducts(Model model) {
		
		if(repo.findAll().isEmpty()) {
			return addNewProduct(model);
		}		
		model.addAttribute("products", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputProduct")
	public String addNewProduct(Model model) {
		Product p = new Product();
		model.addAttribute("newProduct", p);
		return "input";
	}
	
	@PostMapping("/inputProduct")
	public String addNewProduct(@ModelAttribute Product p, Model model) {
		repo.save(p);
		return viewAllProducts(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateProduct(@PathVariable("id") long id, Model model) {
		Product p = repo.findById(id).orElse(null);
		model.addAttribute("newProduct", p);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseProduct(Product p, Model model) {
		repo.save(p);
		return viewAllProducts(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Product p = repo.findById(id).orElse(null);
		repo.delete(p);
		return viewAllProducts(model);
	}
}
