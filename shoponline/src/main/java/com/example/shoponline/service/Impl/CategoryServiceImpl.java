package com.example.shoponline.service.Impl;

import com.example.shoponline.Constant.Constant;
import com.example.shoponline.dto.updateCategoryDto;
import com.example.shoponline.entity.Category;
import com.example.shoponline.repository.CategoryRepository;
import com.example.shoponline.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) throws Exception {
        if (!categoryRepository.findByNameLike(category.getName().trim()).isEmpty()) {
            throw new Exception(Constant.DUPLICATED_CATEGORY);
        }else {
            Category newCate = new Category();
            BeanUtils.copyProperties(category,newCate);
            newCate.setName(category.getName());
            newCate.setStatus(1);
            return categoryRepository.save(newCate);
        }
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Loại Sản Phẩm Không Tồn Tại"));
    }

    @Override
    public Category updateCategoryById(updateCategoryDto categoryDto, Integer id) throws Exception {
        Category category = categoryRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Loại Sản Phẩm không Tồn Tại"));
        if(!categoryRepository.findByNameLike(category.getName().trim()).isEmpty()){
            throw new Exception(Constant.DUPLICATED_CATEGORY);
        }else {
            BeanUtils.copyProperties(categoryDto,category);
            category.setName(categoryDto.getName().trim());
            category.setStatus(1);
            return categoryRepository.save(category);
        }
    }

    @Override
    public Page<Category> getCategory(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public List<Category> getCategorysByStatus(int status) {
        return categoryRepository.findByStatus(status);
    }
}
