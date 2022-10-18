package com.springShopppy.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.springShopppy.model.product;
import com.springShopppy.repository.productRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
	
	//Repository to Communicate and Configure the DataBase
	@Autowired
	private productRepository repo;
	
	//Getting Products and Returning To Controller
	public List<product> getAllProducts(){
		
		List<product> productList = new ArrayList<>();
		repo.findAll().forEach(productList::add);
		return productList;
	}
	
	//Adding Products To DataBase
	public String addProduct(product p1) {
		repo.save(p1);
		return "successfully added!.....";
	}
	
	//Getting Product If id is Available
	public Optional<product> getProduct(int id){
		return repo.findById(id);
	}
	
	//Delete Product By Using id
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "Deleted Successfully";
	}
	
	//Adding All Products To Database
	public String addallProducts(List<product> p1) {
		repo.saveAll(p1);
		return "successfully added";
	}
	
	//Getting ProductByName
	public product getProductByName(String productName) {
		return repo.findByProductName(productName);
	}
	
	//Getting ProductByPrice
	public List<product> getProductByPrice(int productPrice){
		return repo.findByProductPrice(productPrice);
	}

}
