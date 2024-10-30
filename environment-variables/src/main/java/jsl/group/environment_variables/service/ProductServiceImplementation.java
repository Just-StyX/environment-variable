package jsl.group.environment_variables.service;

import jsl.group.environment_variables.model.Product;
import jsl.group.environment_variables.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImplementation implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
