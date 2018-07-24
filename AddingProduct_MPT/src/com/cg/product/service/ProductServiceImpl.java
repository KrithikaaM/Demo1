package com.cg.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.dao.ProductDao;
import com.cg.product.dto.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao dao;
	
	@Override
	public void addProduct(Product p) {
		dao.addProduct(p);
		
	}

	@Override
	public List<Product> showAll() {
		
		return dao.showAll();
	}

	

	public void deleteProduct(int id) {
		dao.deleteProduct(id);
		
	}

	@Override
	public Product searchProduct(int id) {
	return dao.searchProduct(id);
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		 dao.updateProduct(p);
	}

	
	
	
}
