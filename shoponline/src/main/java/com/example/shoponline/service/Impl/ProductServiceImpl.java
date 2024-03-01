package com.example.shoponline.service.Impl;

import com.example.shoponline.entity.Product;
import com.example.shoponline.repository.ProductRepository;
import com.example.shoponline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

//    @Override
//    public Product update(Product product) {
//        return null;
//    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
