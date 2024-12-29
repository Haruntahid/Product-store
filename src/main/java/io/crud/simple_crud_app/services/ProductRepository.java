package io.crud.simple_crud_app.services;

import io.crud.simple_crud_app.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
