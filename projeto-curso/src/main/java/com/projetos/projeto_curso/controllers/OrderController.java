package com.projetos.projeto_curso.controllers;

import com.projetos.projeto_curso.entities.Order;
import com.projetos.projeto_curso.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAll() {
        var orders = this.orderService.listAll();

        return ResponseEntity.ok().body(orders);
    }

    @GetMapping(value = "/{orderId}")
    public ResponseEntity<Order> getById(@PathVariable Long orderId) {
        var order = this.orderService.listById(orderId);

        return ResponseEntity.ok().body(order);
    }
}
