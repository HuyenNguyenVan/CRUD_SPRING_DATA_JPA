package com.example.demoSpringBoot.repository;

import com.example.demoSpringBoot.entity.Product;
import com.example.demoSpringBoot.repository.customeRepo.ProductRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>, ProductRepositoryCustom, JpaSpecificationExecutor<Product> {


    @Query(value = "select p.id_Product from Product p where p.id_Product = :id")
    Long getId(@Param("id") Long id);


//    Long countBy(String nameProduct);

    Page<Product> findAllBynameProduct(String nameProduct, Pageable pageable);
}
