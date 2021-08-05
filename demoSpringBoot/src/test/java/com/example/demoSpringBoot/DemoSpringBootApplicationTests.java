package com.example.demoSpringBoot;

import com.example.demoSpringBoot.repository.customeRepo.Impl.ProductRepositoryCustomImpl;
import com.example.demoSpringBoot.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringBootApplicationTests {

    @Autowired
    ProductService productService;


    @Autowired
    ProductRepositoryCustomImpl productRepositoryCustom;

    @Test
    void testProductService() {


        productRepositoryCustom.finAllCategoryByNameQuery();
//        productService.finAllProductByNameQuery();
    }


}
