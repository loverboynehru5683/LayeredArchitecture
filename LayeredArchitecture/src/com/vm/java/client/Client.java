package com.vm.java.client;

import com.vm.java.bean.Product;
import com.vm.java.service.ProductService;

public class Client {
	
	public static void main(String[] args) {
		
		ProductService productservice = new ProductService();
		Product product = productservice.getProductById(100);
		
		System.out.println("Product");
		
		System.out.println(product.getProductId()+" "+product.getProductName()+" "
							+product.getCategory()+" "+product.getPrice());
		
		System.out.println(productservice.getAllProducts());
		
	}

}
