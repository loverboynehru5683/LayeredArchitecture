package com.vm.java.dao;

import java.util.Map;

import com.vm.java.bean.Product;
import com.vm.java.util.CollectionUtil;

public class ProductDAO implements IProductDAO {

	//CollectionUtil cu = new CollectionUtil();
	
	@Override
	public Product getProductById(int id)
	{
		Map<Integer,Product> hashmap = CollectionUtil.getProducts();
		Product product = hashmap.get(id);
		return product;
	}

	@Override
	public Map getAllProducts() {

		return CollectionUtil.getProducts();
	}
}
