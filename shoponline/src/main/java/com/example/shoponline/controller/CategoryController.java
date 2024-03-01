package com.example.shoponline.controller;

import com.example.shoponline.entity.Category;
import com.example.shoponline.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/get-all")
    public ResponseEntity<?>getAll(){
        return ResponseEntity.ok().body(categoryService.getAll());
    }

    @PostMapping("/create")
    public ResponseEntity<?>createCategory(@RequestBody @Valid Category category) throws Exception {
        return ResponseEntity.ok(categoryService.create(category));
    }
}
