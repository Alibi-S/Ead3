package com.example.spring.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Product() {
    }

    private String title;
    private String description;
    private double price;

}
