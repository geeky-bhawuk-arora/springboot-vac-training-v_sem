package com.springLearn.ProductApp1.repositories;

import com.springLearn.ProductApp1.model.Product;  
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> { 

}
