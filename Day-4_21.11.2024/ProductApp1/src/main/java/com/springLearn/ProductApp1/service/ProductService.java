package com.springLearn.ProductApp1.service;

import com.springLearn.ProductApp1.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    
    // Create a new product
    Product createProduct(Product product);
}
