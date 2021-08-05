package com.example.demoSpringBoot.service;

import com.example.demoSpringBoot.dto.ProductDTO;
import com.example.demoSpringBoot.dto.UpdateProductDTO;
import com.example.demoSpringBoot.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    boolean updateProduct(UpdateProductDTO updateProductDTO);

    boolean createProduct(ProductDTO productDTO);

    boolean deleteProductById(Long id);

    Page<Product> getAllProducts(Pageable pageable);

    Page<Product> getProductByName(String nameProduct, Pageable pageable);

    List<Product> finAllProductByNameQuery();
}
