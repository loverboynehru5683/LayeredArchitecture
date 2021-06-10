package com.vm.java.dao;

import java.util.Map;

import com.vm.java.bean.Product;

public interface IProductDAO {
	
	Product getProductById(int id);
	Map<Integer,Product> getAllProducts();

}
