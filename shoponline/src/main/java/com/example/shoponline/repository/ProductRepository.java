package com.example.shoponline.repository;

import com.example.shoponline.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByNameLike(String name);
    List<Product> findByName(String name);

}
