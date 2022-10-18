package com.springShopppy.repository;

import java.util.List;

import com.springShopppy.model.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface productRepository extends JpaRepository<product,Integer>{

	product findByProductName(String productName);
	
	//Product Price
	//FindByProductPrice
	@Query(value = "select * from product where product_price < ?1",nativeQuery = true)
	List<product> findByProductPrice(int productPrice);
}
