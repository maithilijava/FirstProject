package com.brilliant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.brilliant.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
