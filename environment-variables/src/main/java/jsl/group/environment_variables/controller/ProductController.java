package jsl.group.environment_variables.controller;

import jsl.group.environment_variables.model.Product;
import jsl.group.environment_variables.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    private ResponseEntity<Product> saveProduct(
            @RequestBody Product product
    ) {
        return ResponseEntity.ok().body(productService.save(product));
    }
}
