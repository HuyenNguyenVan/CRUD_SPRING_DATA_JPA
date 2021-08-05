package com.example.demoSpringBoot.dto;
import java.util.Set;

public class ProductDTO {


    private String nameProduct;


    private Long numberProducts;

    private String nameCategory;

    Set<ProductDetailDTO> productDetails;


    public Set<ProductDetailDTO> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(Set<ProductDetailDTO> productDetails) {
        this.productDetails = productDetails;
    }

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
