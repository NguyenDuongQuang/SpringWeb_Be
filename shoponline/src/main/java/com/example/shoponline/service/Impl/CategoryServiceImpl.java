package com.example.shoponline.service.Impl;

import com.example.shoponline.entity.Category;
import com.example.shoponline.repository.CategoryRepository;
import com.example.shoponline.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category create(Category category) throws Exception {
        return categoryRepository.save(category);
    }

    @Override
    public Optional<Category> getCategoryById(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category updateById(Category category, Integer id) throws Exception {
        return null;
    }

    @Override
    public Page<Category> getCategory(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public void deleteCategory_(Integer id) {
        categoryRepository.deleteById(id);
    }
}
