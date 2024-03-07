package com.example.shoponline.repository;

import com.example.shoponline.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductSetRepository extends JpaRepository<Product,Integer> {
    List<Product>findByName(String name);
}
