package com.example.demoSpringBoot.controller;


import com.example.demoSpringBoot.entity.Category;
import com.example.demoSpringBoot.entity.Product;
import com.example.demoSpringBoot.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {

    CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/nameCategory/{nameCategory}")
    public void getListCategory(@PathVariable String nameCategory) {

        Category byNameCategory = categoryRepository.findAllByNameCategory(nameCategory);

        for (Product product : byNameCategory.getProducts()) {
            System.out.println(" ---------------- " + product.getNameProduct());
        }

    }


}
