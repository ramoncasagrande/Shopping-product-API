package com.shopping.productapi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shopping.productapi.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
    @Query(value =  "select p from product p" +
                    "join category c on p.category.id = c.id" +
                    "where c.id = :categoryId")  //rever se entra : antes do categoryId
    public List<Product> getProductByCategory(@Param("categoryId") Long categoryId);

    public Product findByProductIdentifier(String productIdentifier);
}
