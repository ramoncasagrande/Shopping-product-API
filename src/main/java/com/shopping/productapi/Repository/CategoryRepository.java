package com.shopping.productapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.productapi.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
