package com.training.pms.galaxe.service;

import java.util.List;

import com.training.pms.galaxe.controller.Product;

public interface ProductService {
	
	
public String saveProduct(Product product);
	
	




	public String updateProduct(Product product);
	public String deleteProduct(int productId);
	public Product getProduct(int productId);
	public List<Product> getProduct();
	
	public boolean isProductExists(int productId);
	
	public List<Product> searchProduct(Integer price);
	public List<Product> searchProduct(String productName);

	public List<Product> searchProduct(int min,int max);
	public List<Product> checkStockStatus(int minStock);






	 public List<Product> searchProduct(String productName, int price, int qoh);






	

}
