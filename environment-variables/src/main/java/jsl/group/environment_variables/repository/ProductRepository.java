package jsl.group.environment_variables.repository;

import jsl.group.environment_variables.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
