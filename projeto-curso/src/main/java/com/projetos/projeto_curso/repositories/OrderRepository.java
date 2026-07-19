package com.projetos.projeto_curso.repositories;

import com.projetos.projeto_curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
