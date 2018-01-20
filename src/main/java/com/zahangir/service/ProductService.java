package com.zahangir.service;

import java.util.List;
import com.zahangir.model.Product;

public interface ProductService {
	void addProduct(Product product);
	void updateProduct(Product product);
	Product getProductById(int productId);
	List<Product> getAllProduct();
	void deleteProductById(int productId);
}
