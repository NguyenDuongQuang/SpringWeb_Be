package com.example.shoponline.repository;

import com.example.shoponline.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    List<Category>findByNameLike(String name);

    List<Category>findByStatus(int status);

    long countByStatus(int status);
}
