package com.example.spring.service;

import com.example.spring.DAO.ProductDAO;
import com.example.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public List<Product> findAllProducts() {
        return productDAO.findAll();
    }

    public Optional<Product> findProductById(Long id) {
        return productDAO.findById(id);
    }

    public Optional<Product> findByTitle(String nickname) {
        return productDAO.findProductByTitle(nickname);
    }

    public Optional<Product> findProductByPrice(Double price) {
        return productDAO.findProductByPrice(price);
    }

    public void createProduct(Product user) {
        productDAO.save(user);
    }

    public void updateProduct(Long id, Product product) {
        Product productDb = productDAO.findById(id).orElse(null);
        if (productDb != null) {
            productDb.setDescription(product.getDescription());
            productDb.setPrice(product.getPrice());
            productDAO.saveAndFlush(productDb);
        }
    }

    public void deleteProduct(Long id) {
        productDAO.deleteById(id);
    }
}
