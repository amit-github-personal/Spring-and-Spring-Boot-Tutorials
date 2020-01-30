package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {

	Product save(Product product);
	
	List<Product> productList();
	
	public void delete(Integer id);

	Product updateProductInfo(Product product);

	
}


