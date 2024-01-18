package com.example.demo1.service;



import com.example.demo1.repository.ProductRepository;
import com.example.demo1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return  productRepository.getAllProduct();
    }
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }
    public Product findById(int id) {
        return productRepository.findById(id);
    }
}