package com.vm.java.service;

import java.util.Map;

import com.vm.java.bean.Product;

public interface IProductService {
	
	Product getProductById(int id);
	Map<Integer,Product> getAllProducts();
	
}
