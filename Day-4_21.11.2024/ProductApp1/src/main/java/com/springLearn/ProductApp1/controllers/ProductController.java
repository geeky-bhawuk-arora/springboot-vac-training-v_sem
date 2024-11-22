package com.springLearn.ProductApp1.controllers;

import com.springLearn.ProductApp1.model.Product;
import com.springLearn.ProductApp1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/register")
    public String registerPage() {
        return "productRegister"; 
    }

    @PostMapping("/register")
    public String registerProduct(Product product, Model model) {
        Product savedProduct = productService.createProduct(product);
        model.addAttribute("product", savedProduct);
        return "productSummary";  
    }
}
