package com.example.shoponline.service.Impl;

import com.example.shoponline.dto.ProductSaleDto;
import com.example.shoponline.entity.Product;
import com.example.shoponline.repository.ProductRepository;
import com.example.shoponline.repository.ProductSetRepository;
import com.example.shoponline.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    private ProductSetRepository productSetRepository;
    private ProductRepository productRepository;
    @Override
    public List<ProductSaleDto> getProductSetCategorySale() {
        List<ProductSaleDto>productSaleDtos=new ArrayList<>();
        List<Product>products=productRepository.findAll();
        products.stream().filter(product -> product.getStatus()==1)
                .forEach(product -> {
                    ProductSaleDto productSaleDto=new ProductSaleDto();
                    productSaleDto.setName(product.getName());
                    List<ProductSaleDto.CategorySaleDto> categorySaleDtos=new ArrayList<>();

                });
        return null;
    }
}
