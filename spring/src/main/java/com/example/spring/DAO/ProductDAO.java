package com.example.spring.DAO;

import com.example.spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {
    Optional<Product> findProductByTitle(String title);
    Optional<Product> findProductByPrice(Double price);
}
