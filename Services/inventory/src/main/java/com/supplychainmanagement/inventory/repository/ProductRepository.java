package com.supplychainmanagement.inventory.repository;

import com.supplychainmanagement.inventory.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
}
