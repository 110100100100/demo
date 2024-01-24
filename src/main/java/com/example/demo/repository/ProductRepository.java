package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> productList = new ArrayList<Product>();
    public ProductRepository() {
        Product product = new Product(1L,"BaoNgao","Ngaovl",0.0,"12/12/2004");
        productList.add(product);
    }
    public List<Product> getProductList() {
        return productList;
    }

    public void createProduct(Product product) {
        productList.add(product);
    }
}
