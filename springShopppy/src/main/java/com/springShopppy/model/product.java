package com.springShopppy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class product {
	
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	private int productAvail;
	
	
}
