package com.cg.product.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.product.dto.Product;


@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	@PersistenceContext
	EntityManager entitymanager;
	
	public void addProduct(Product p) {
		
		entitymanager.persist(p);
	}

	public List<Product> showAll() {
		List<Product> list = new ArrayList<Product>();
		Query q = entitymanager.createQuery("from Product");
		list = q.getResultList();
		return list;
		
	}

	
	public Product searchProduct(int id)
	{
		
		Query q = entitymanager.createQuery("from Product where id=:id");
		q.setParameter("id", id);
		Product p1 = (Product)q.getSingleResult();
		return p1;
		
		
		
	}

	
	public void deleteProduct(int id) {
		
	Query q = entitymanager.createQuery("from Product where id=:id");
	q.setParameter("id", id);
	Product p1 = (Product)q.getSingleResult();
	entitymanager.remove(p1);
	}
	
	public void updateProduct(Product p) {
		entitymanager.merge(p);
}
}
