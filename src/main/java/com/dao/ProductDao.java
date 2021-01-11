package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {

	List<Product> getAllProducts();

	Product getProductById(Integer productId);

	void deleteProduct(Integer productId);

	void addProduct(Product product);
	
	void editProduct(Product product);
	
}
