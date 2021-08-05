package com.example.demoSpringBoot.repository;


import com.example.demoSpringBoot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


    Category findAllByNameCategory(@Param("nameProduct") String nameProduct);

}
