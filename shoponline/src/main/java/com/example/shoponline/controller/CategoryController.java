package com.example.shoponline.controller;

import com.example.shoponline.dto.updateCategoryDto;
import com.example.shoponline.entity.Category;
import com.example.shoponline.service.CategoryService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<?>createCategory(@RequestBody @Valid Category category) throws Exception {
        return ResponseEntity.ok().body(categoryService.createCategory(category));
    }

    @GetMapping("/get-detail/{id}")
    public ResponseEntity<?>getCateId(@PathVariable @Positive Integer id){
        return ResponseEntity.ok().body(categoryService.getCategoryById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCate(@RequestBody updateCategoryDto updateCategoryDto,@PathVariable @Positive Integer id) throws Exception{
        return ResponseEntity.ok().body(categoryService.updateCategoryById(updateCategoryDto,id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<?>getAll(){
        return ResponseEntity.ok().body(categoryService.getCategorysByStatus(1));
    }
}
