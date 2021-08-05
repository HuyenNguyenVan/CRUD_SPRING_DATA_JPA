package com.example.demoSpringBoot.entity;

import javax.persistence.*;


@Entity
@Table(name = "size_product")
public class SizeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_size")
    Long idSize;


    @Column(name = "name_size")
    String nameSize;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_productDetails", referencedColumnName = "id_product_details")
    ProductDetails productDetailsSize;

    public ProductDetails getProductDetailsSize() {
        return productDetailsSize;
    }

    public void setProductDetailsSize(ProductDetails productDetailsSize) {
        this.productDetailsSize = productDetailsSize;
    }

    public Long getIdSize() {
        return idSize;
    }

    public void setIdSize(Long idSize) {
        this.idSize = idSize;
    }

    public String getNameSize() {
        return nameSize;
    }

    public void setNameSize(String nameSize) {
        this.nameSize = nameSize;
    }
}
