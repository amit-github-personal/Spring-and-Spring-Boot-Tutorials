package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepositry;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepositry productRepo;
	
	
	@Override
	public Product save(Product product) {
		
		return productRepo.save(product);
	}


	@Override
	public List<Product> productList() {
		return productRepo.findAll();
	}


	@Override
	public void delete(Integer id) {
		productRepo.deleteById(id);
		System.out.println("product deleted succesfully");
	}


	@Override
	public Product updateProductInfo(Product product) {
		return productRepo.save(product);
	}



	

	

}


