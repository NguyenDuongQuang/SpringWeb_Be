package com.example.shoponline.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Data
public class ProductSaleDto implements Serializable {
    private String name;
    private List<CategorySaleDto> categoryList;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CategorySaleDto implements Serializable {
        private Integer id;
        private String name;
    }
}
