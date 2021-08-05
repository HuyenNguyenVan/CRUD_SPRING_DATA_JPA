package com.example.demoSpringBoot.entity;


import javax.persistence.*;

@Entity
@Table(name = "product")

@NamedQueries({
        // @NamedQuery chỉ nhận vào class Entity
        @NamedQuery(name = "product.findAll", query = "SELECT p from Product p join fetch p.category")
})

public class Product {


    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Product;


    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "number_product")
    private Long numberProducts;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category", referencedColumnName = "id_category")
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
