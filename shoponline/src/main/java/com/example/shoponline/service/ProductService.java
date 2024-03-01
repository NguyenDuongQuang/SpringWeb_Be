package com.example.shoponline.service;

import com.example.shoponline.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();

    Product create(Product product) throws Exception;

    Optional<Product> getProductById(Integer id);

    Product updateById(Product product,Integer id) throws Exception;

    Page<Product> getProduct(Pageable pageable);
    void deleteProductById(Integer id);;
}
