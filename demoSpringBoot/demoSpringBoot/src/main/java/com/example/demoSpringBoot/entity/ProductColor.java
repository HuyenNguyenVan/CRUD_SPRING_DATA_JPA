package com.example.demoSpringBoot.entity;
import javax.persistence.*;

@Entity
@Table(name = "product_color")
public class ProductColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_color")
    private Long idColor;

    @Column(name = "name_color")
    private String nameColor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_productDetails", referencedColumnName = "id_product_details")
    ProductDetails productDetailsColor;


    public ProductDetails getProductDetailsColor() {
        return productDetailsColor;
    }

    public void setProductDetailsColor(ProductDetails productDetailsColor) {
        this.productDetailsColor = productDetailsColor;
    }

    public Long getIdColor() {
        return idColor;
    }

    public void setIdColor(Long idColor) {
        this.idColor = idColor;
    }



    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }
}
