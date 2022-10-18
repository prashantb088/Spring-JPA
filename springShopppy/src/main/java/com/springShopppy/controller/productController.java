package com.springShopppy.controller;

import java.util.List;
import java.util.Optional;

import com.springShopppy.Service.productService;
import com.springShopppy.model.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

	@Autowired
	private productService service;
	
	//Getting All Products from DataBase 
	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public List<product> getAllProducts(){
		return service.getAllProducts();
	}
	
	//Adding New Product To DataBase
	@RequestMapping(method = RequestMethod.POST, value= "/products")
	public String addProduct(@RequestBody product p1) {
		
		return service.addProduct(p1);
		
	}
	
	//Adding List Of Products To Database
	@RequestMapping(method = RequestMethod.POST, value = "/addall")
	public String addAll(@RequestBody List<product> productList) {
		return service.addallProducts(productList);
	}
	
	//Getting Products By Name
	@RequestMapping(method = RequestMethod.GET, value = "/productname/{name}")
	public product getProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	//Getting Products By Price 
	@RequestMapping(method = RequestMethod.GET, value = "/productprice/{amount}")
	public List<product> getProductByPrice(@PathVariable int amount){
		return service.getProductByPrice(amount);
	}
	
	//Getting Specific Product From DataBase
	@RequestMapping(method = RequestMethod.GET,value = "/product/{id}")
	public Optional<product> getProduct(@PathVariable int id){
		return service.getProduct(id);
	}
	
	//Delete Product From DataBase
	@RequestMapping(method = RequestMethod.DELETE,value = "/product/{}id")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	}
