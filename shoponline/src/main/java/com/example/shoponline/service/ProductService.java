package com.example.shoponline.service;

import com.example.shoponline.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product create(Product product);

    Optional<Product> getProductById(Long id);

    List<Product>getAll();

//    Product update(Product product);

    void deleteProduct(Long id);
}
