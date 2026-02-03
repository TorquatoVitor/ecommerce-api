package com.example.demo.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;



@Configuration
@Profile("Default")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String...args) throws Exception {
		
		
		Category cat1 = new Category(null, "eletronicos");
		Category cat2 = new Category(null, "livros");
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		
		Product p1 = new Product(null, "Smartphone", "desc...", 4500.0, "");
		p1.setCategory(cat1); //associando ao eletronicos
		
		Product p2 = new Product(null, "clean code", "livro de programacao", 120.0, "");
		p2.setCategory(cat2); //associando ao Livros
		
		productRepository.saveAll(Arrays.asList(p1, p2));
	}
	
}
