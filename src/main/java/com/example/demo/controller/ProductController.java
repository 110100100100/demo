package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String products(Model model) {
        List<Product> productList = productService.getProductList();
        model.addAttribute("products", productList);
        return "/home";
    }
    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "/create";
    }

    @PostMapping("/create")
    public String createCar(@ModelAttribute Product product) {
        productService.createProduct(product);

        return "redirect:/products";
    }
}
