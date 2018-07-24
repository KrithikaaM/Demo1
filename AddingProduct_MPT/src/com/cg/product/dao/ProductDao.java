package com.cg.product.dao;

import java.util.List;

import com.cg.product.dto.Product;

public interface ProductDao {
	public void addProduct(Product p);
	public List<Product> showAll();
	public Product searchProduct(int id);
	public void deleteProduct(int id);
	public void updateProduct(Product p);
}
