package com.example.demoSpringBoot.repository.customeRepo.Impl;

import com.example.demoSpringBoot.entity.Category;
import com.example.demoSpringBoot.entity.Product;
import com.example.demoSpringBoot.repository.customeRepo.ProductRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Product> finAllProductByNameQuery() {

        TypedQuery<Product> namedQuery = entityManager.createNamedQuery("product.findAll", Product.class);

        return namedQuery.getResultList();
    }

    @Override
    @Transactional
    public List<Category> finAllCategoryByNameQuery() {
        TypedQuery<Category> namedQuery = entityManager.createNamedQuery("Category.finAll", Category.class);
//                .setParameter("nameCategory", name);
//
        List<Category> productList = namedQuery.getResultList();

//        for (Category category : productList) {
//            System.out.println(" --------------- " + category.getNameCategory());
//            System.out.println(" +++++++++++++++++++ 00000000000000000" + category.getProducts().get(0).getNameProduct());
//        }
        return productList;
//        return productList;
    }
}
