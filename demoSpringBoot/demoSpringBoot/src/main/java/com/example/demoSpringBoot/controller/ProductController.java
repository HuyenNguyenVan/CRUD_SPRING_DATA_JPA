package com.example.demoSpringBoot.controller;

import com.example.demoSpringBoot.dto.ProductDTO;
import com.example.demoSpringBoot.dto.UpdateProductDTO;
import com.example.demoSpringBoot.entity.Product;
import com.example.demoSpringBoot.mapper.ProductMapper;

import com.example.demoSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    ProductMapper productMapper;

    // mục đích là muốn lấy màu (table colorProduct) , size (table sizeProduct) , số lượng của sản phẩm

    @GetMapping("/id/{id}")
    ResponseEntity<?> getProductById(@PathVariable("id") Long id) {
        ProductDTO productById = productService.getProductById(id);
        if (productById == null) {
            return new ResponseEntity("The product id you entered does not exist in the system", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(productById, HttpStatus.OK);
    }


    @GetMapping()
    ResponseEntity<Page<Product>> getAllProducts(@PageableDefault Pageable pageable) {
        return new ResponseEntity(productService.getAllProducts(pageable), HttpStatus.OK);
    }


    @GetMapping("/nameProduct/{nameProduct}")
    ResponseEntity<Page<Product>> getProductByName(@PathVariable String nameProduct, @PageableDefault Pageable pageable) {
        Page<Product> productsByName = productService.getProductByName(nameProduct, pageable);
        if (productsByName.getTotalElements() > 0) {
            return new ResponseEntity(productsByName, HttpStatus.OK);
        }
        return new ResponseEntity("Not fount Product with Name :  " + nameProduct, HttpStatus.BAD_REQUEST);
    }


    @PostMapping()
    ResponseEntity<String> createProduct(@RequestBody ProductDTO productDTO) {

        if (productService.createProduct(productDTO)) {
            return new ResponseEntity<>("successful product creation", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Product creation failed", HttpStatus.BAD_REQUEST);
    }


    @PutMapping()
    ResponseEntity<String> updateProduct(@RequestBody UpdateProductDTO updateProductDTO) {

        if (productService.updateProduct(updateProductDTO)) {
            return new ResponseEntity<>("successful product update", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Product update failed", HttpStatus.BAD_REQUEST);
    }


    @DeleteMapping("/id/{id}")
    ResponseEntity<String> deleteById(@PathVariable Long id) {
        if (productService.deleteProductById(id)) {
            return new ResponseEntity<>("Delete product successful with Id =  " + id, HttpStatus.OK);
        }
        return new ResponseEntity<>("Not Found with Id =  " + id, HttpStatus.NOT_FOUND);
    }

}
