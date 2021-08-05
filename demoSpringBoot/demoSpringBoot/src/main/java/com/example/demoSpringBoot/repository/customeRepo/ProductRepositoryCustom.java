package com.example.demoSpringBoot.repository.customeRepo;

import com.example.demoSpringBoot.entity.Category;
import com.example.demoSpringBoot.entity.Product;

import java.util.List;

public interface ProductRepositoryCustom {

    List<Product> finAllProductByNameQuery();

    List<Category> finAllCategoryByNameQuery();
}
