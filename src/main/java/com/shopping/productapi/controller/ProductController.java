package com.shopping.productapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.productapi.DTO.ProductDTO;
import com.shopping.productapi.Service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<ProductDTO> getProducts(){
        List<ProductDTO> products = productService.getAll();
        return products;
    }


    
}
