package com.cg.product.service;

import java.util.List;

import com.cg.product.dto.Product;

public interface ProductService {
	public void addProduct(Product p);
	public List<Product> showAll();
	public void updateProduct(Product p);
	public Product searchProduct(int id);
	public void deleteProduct(int id);
}
