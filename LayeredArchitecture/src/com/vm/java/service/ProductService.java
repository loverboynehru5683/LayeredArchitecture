package com.vm.java.service;

import java.util.Map;

import com.vm.java.bean.Product;
import com.vm.java.dao.IProductDAO;
import com.vm.java.dao.ProductDAO;

public class ProductService implements IProductService{
	
	IProductDAO productDAO = new ProductDAO();

	@Override
	public Product getProductById(int id) 
	{
		return productDAO.getProductById(id);
	}

	@Override
	public Map<Integer, Product> getAllProducts() 
	{
		return productDAO.getAllProducts();
	}
	
	

}
