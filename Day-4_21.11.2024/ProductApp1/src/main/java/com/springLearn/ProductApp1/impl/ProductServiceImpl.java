package com.springLearn.ProductApp1.impl;

import com.springLearn.ProductApp1.model.Product;
import com.springLearn.ProductApp1.repositories.ProductRepo;
import com.springLearn.ProductApp1.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product createProduct(Product product) {
        System.out.println("Saving product to the database: " + product.getName());
        return productRepo.save(product);
    }
}

