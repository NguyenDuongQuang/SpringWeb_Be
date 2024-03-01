package com.example.shoponline.service.Impl;

import com.example.shoponline.entity.Product;
import com.example.shoponline.repository.ProductRepository;
import com.example.shoponline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product create(Product product) throws Exception {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public Product updateById(Product product, Integer id) throws Exception {
        return null;
    }

    @Override
    public Page<Product> getProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}
