package com.example.demoSpringBoot.dto;


import java.util.Set;

public class ProductDetailDTO {

    private Long idProductDetails;

    private Long amount;


    Set<SizeProductDTO> sizeProducts;


    Set<ProductColorDTO> productColors;


    public Set<SizeProductDTO> getSizeProducts() {
        return sizeProducts;
    }

    public void setSizeProducts(Set<SizeProductDTO> sizeProducts) {
        this.sizeProducts = sizeProducts;
    }

    public Set<ProductColorDTO> getProductColors() {
        return productColors;
    }

    public void setProductColors(Set<ProductColorDTO> productColors) {
        this.productColors = productColors;
    }

    public Long getIdProductDetails() {
        return idProductDetails;
    }

    public void setIdProductDetails(Long idProductDetails) {
        this.idProductDetails = idProductDetails;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }


}
