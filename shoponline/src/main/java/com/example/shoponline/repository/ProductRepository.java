package com.example.shoponline.repository;

import com.example.shoponline.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
//    List<Product>findAllByCategoryId(long id);
//    Product findById(long id);
//    Product deleteById(long id);
//    Product findAllById(long id);

}
