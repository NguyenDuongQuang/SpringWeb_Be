package com.example.shoponline.repository;

import com.example.shoponline.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer  > {
//    Category findById(long id);
//    Page<Category> findByNameLike(String keyword, Pageable pageable);
//    Category deleteById(long id);
}
