package com.projetos.projeto_curso.services;

import com.projetos.projeto_curso.entities.Product;
import com.projetos.projeto_curso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll() {
        return this.productRepository.findAll();
    }

    public Product listById(Long productId) {
        Optional<Product> product = this.productRepository.findById(productId);

        return product.get();
    }
}
