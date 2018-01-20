package com.zahangir.repository;

import org.springframework.data.repository.CrudRepository;
import com.zahangir.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
