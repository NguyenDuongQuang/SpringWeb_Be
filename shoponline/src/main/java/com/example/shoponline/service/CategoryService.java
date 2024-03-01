package com.example.shoponline.service;

import com.example.shoponline.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAll();

    Category create(Category category) throws Exception;

    Optional<Category> getCategoryById(Integer id);

    Category updateById(Category category,Integer id) throws Exception;

    Page<Category> getCategory(Pageable pageable);
    void deleteCategory_(Integer id);

}
