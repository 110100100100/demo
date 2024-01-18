package com.example.demo1.repository;

import com.example.demo1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> listProduct = new ArrayList<>();

    public ProductRepository(){
        Product product1 = new Product("iphone11","chip13",500);
        Product product2 = new Product("iphone12","chip14",599);
        Product product3 = new Product("iphone12pro","chip14",700);

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
    }

    public List<Product> getAllProduct() {
        return listProduct;
    }
    public void createProduct(Product product) {
        listProduct.add(product);
    }
    public Product findById(int id) {
        return listProduct.get(id);
    }
}
