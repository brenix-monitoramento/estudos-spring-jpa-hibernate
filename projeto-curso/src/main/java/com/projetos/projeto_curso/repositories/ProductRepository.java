package com.projetos.projeto_curso.repositories;

import com.projetos.projeto_curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
