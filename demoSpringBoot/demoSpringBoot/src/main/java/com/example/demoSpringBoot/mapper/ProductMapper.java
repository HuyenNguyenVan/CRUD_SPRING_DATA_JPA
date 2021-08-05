package com.example.demoSpringBoot.mapper;

import com.example.demoSpringBoot.dto.ProductDTO;
import com.example.demoSpringBoot.dto.UpdateProductDTO;
import com.example.demoSpringBoot.entity.Product;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product productDtoToProduct(ProductDTO productDTO);

    ProductDTO productToProductDTO(Product product);

    Product UpdateProductToDtoProduct(UpdateProductDTO updateProductDTO);
}
