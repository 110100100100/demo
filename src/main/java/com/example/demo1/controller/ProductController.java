package com.example.demo1.controller;

import com.example.demo1.model.Product;
import com.example.demo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String showHome(Model model) {
        List<Product> lists = productService.getAllProducts();

        model.addAttribute("listProduct", lists);

        return "/product/list";
    }
    @GetMapping("/add")
    public String create(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "/product/create";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        System.out.println(product);
        productService.createProduct(product);

        redirectAttributes.addFlashAttribute("message", "Create successfully");

        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable ("id")int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);


        return "/edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }

}
