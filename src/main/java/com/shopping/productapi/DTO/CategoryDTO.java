package com.shopping.productapi.DTO;

import com.shopping.productapi.Model.Category;

import jakarta.validation.constraints.NotNull;

public class CategoryDTO {
    
    @NotNull
    private Long id;
    private String nome;
    
    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static CategoryDTO convert(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());
        return categoryDTO;
    }

}
