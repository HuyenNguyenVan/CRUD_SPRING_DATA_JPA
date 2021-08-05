package com.example.demoSpringBoot.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_details")
public class ProductDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_details")
    private Long idProductDetails;

    @Column(name = "amount")
    private Long amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    Product product;


    @OneToMany(mappedBy = "productDetailsSize", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    Set<SizeProduct> sizeProducts;


    @OneToMany(mappedBy = "productDetailsColor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    Set<ProductColor> productColors;


    public Set<SizeProduct> getSizeProducts() {
        return sizeProducts;
    }

    public void setSizeProducts(Set<SizeProduct> sizeProducts) {
        this.sizeProducts = sizeProducts;
    }

    public Set<ProductColor> getProductColors() {
        return productColors;
    }

    public void setProductColors(Set<ProductColor> productColors) {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
