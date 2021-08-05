package com.example.demoSpringBoot.dto;

import com.example.demoSpringBoot.entity.Category;


public class UpdateProductDTO {
    Long id_Product;


    private String nameProduct;


    private Long numberProducts;


    Category category;


    public Long getId_Product() {
        return id_Product;
    }

    public void setId_Product(Long id_Product) {
        this.id_Product = id_Product;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Long getNumberProducts() {
        return numberProducts;
    }

    public void setNumberProducts(Long numberProducts) {
        this.numberProducts = numberProducts;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
