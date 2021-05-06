package com.example.spring.controller;

import com.example.spring.model.Product;
import com.example.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> findProductById(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @GetMapping("/title/{title}")
    public Optional<Product> findByTitle(@PathVariable String title) {
        return productService.findByTitle(title);
    }

    @GetMapping("/price/{price}")
    public Optional<Product> findProductByPrice(@PathVariable Double price) {
        return productService.findProductByPrice(price);
    }
    //ADD
    @PostMapping("/add")
    public void createProduct(@RequestBody Product user) {
        productService.createProduct(user);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody Product product) {
        productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
