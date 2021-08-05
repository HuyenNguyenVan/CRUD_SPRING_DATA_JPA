package com.example.demoSpringBoot.dto;


public class ProductDTO {


    private String nameProduct;


    private Long numberProducts;

    private String nameCategory;


    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
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
}
