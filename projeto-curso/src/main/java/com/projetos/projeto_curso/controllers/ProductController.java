package com.projetos.projeto_curso.controllers;

import com.projetos.projeto_curso.entities.Product;
import com.projetos.projeto_curso.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        var products = this.productService.listAll();

        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{productId}")
    public ResponseEntity<Product> getById(@PathVariable Long productId) {
        var product = this.productService.listById(productId);

        return ResponseEntity.ok().body(product);
    }
}
