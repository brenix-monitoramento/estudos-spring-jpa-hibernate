package com.projetos.projeto_curso.services;

import com.projetos.projeto_curso.entities.Order;
import com.projetos.projeto_curso.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> listAll() {
        return this.orderRepository.findAll();
    }

    public Order listById(Long orderId) {
        Optional<Order> order = this.orderRepository.findById(orderId);

        return order.get();
    }
}
