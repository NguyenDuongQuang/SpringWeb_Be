package com.example.shoponline.service;

import com.example.shoponline.dto.updateCategoryDto;
import com.example.shoponline.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category) throws Exception;

    Category getCategoryById(Integer id);

    Category updateCategoryById(updateCategoryDto categoryDto, Integer id) throws Exception;

    Page<Category> getCategory(Pageable pageable);

    List<Category> getCategorysByStatus(int status);

}
