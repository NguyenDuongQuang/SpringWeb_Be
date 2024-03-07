package com.example.shoponline.service;

import com.example.shoponline.dto.ProductSaleDto;

import java.util.List;

public interface MenuService {
    List<ProductSaleDto> getProductSetCategorySale();
}
