package io.crud.simple_crud_app.controller;

import io.crud.simple_crud_app.models.Product;
import io.crud.simple_crud_app.services.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository products;


    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return products.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return products.findById(id).get();
    }


}
