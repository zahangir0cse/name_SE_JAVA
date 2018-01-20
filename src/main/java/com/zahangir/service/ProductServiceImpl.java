package com.zahangir.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zahangir.model.Product;
import com.zahangir.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product getProductById(int productId) {
		return productRepository.findOne(productId);
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> productList = new ArrayList<>();
		productRepository.findAll().forEach(productList::add);
		return productList;
	}

	@Override
	public void deleteProductById(int productId) {
		productRepository.delete(productId);
	}

}
