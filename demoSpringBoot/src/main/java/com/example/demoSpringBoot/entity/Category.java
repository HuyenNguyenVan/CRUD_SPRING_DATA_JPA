package com.example.demoSpringBoot.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "category")
//@NamedQueries({
//        // @NamedQuery chỉ nhận vào class Entity
//        @NamedQuery(name = "product.findAll", query = "SELECT p from Product p join fetch p.category")
//})



@NamedQueries({
        @NamedQuery(name = "Category.finAll",
                query = "select c from Category c join fetch c.products p") //where  c.name_category = :nameCategory inner join Category c
})
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    Long idCategory;


    @Column(name = "name_category")
    String nameCategory;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
