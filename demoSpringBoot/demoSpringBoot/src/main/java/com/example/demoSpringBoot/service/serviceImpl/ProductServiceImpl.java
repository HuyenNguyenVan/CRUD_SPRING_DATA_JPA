package com.example.demoSpringBoot.service.serviceImpl;

import com.example.demoSpringBoot.dto.ProductDTO;
import com.example.demoSpringBoot.dto.UpdateProductDTO;
import com.example.demoSpringBoot.entity.Product;
import com.example.demoSpringBoot.mapper.ProductMapper;
import com.example.demoSpringBoot.repository.ProductRepository;
import com.example.demoSpringBoot.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }


    @Override
    public boolean updateProduct(UpdateProductDTO updateProductDTO) {

        try {
            Product save = productRepository.save(productMapper.UpdateProductToDtoProduct(updateProductDTO));
            if (save == null) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public boolean createProduct(ProductDTO productDTO) {

        try {
            productRepository.save(productMapper.productDtoToProduct(productDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteProductById(Long id) {

        Long checkExistId = productRepository.getId(id);

        if (checkExistId == null) {
            return false;
        }
        productRepository.deleteById(id);
        return true;
    }

    @Override
    public Page<Product> getAllProducts(Pageable pageable) {

        return productRepository.findAll(pageable);

    }

    @Override
    public Page<Product> getProductByName(String nameProduct, Pageable pageable) {
        return productRepository.findAllByNameProduct(nameProduct, pageable);
    }

    @Override
    public List<Product> finAllProductByNameQuery() {
        return productRepository.finAllProductByNameQuery();
    }


    @Override
    public ProductDTO getProductById(Long id) {
        Product product = null;
        try {
            product = productRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
        
        return productMapper.productToProductDTO(product);
    }
}
