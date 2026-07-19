package com.projetos.projeto_curso.config;

import com.projetos.projeto_curso.entities.Order;
import com.projetos.projeto_curso.entities.User;
import com.projetos.projeto_curso.repositories.OrderRepository;
import com.projetos.projeto_curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) {
        // Instâncias de usuários
        User userOne = new User(null, "John", "john@mail.com", "34343243", "123abc");
        User userTwo = new User(null, "Marie", "marie@mail.com", "6576576", "567abc");

        // Instâncias de pedidos
        Order orderOne = new Order(null, Instant.now(), userOne);
        Order orderTwo = new Order(null, Instant.now(), userOne);
        Order orderThree = new Order(null, Instant.now(), userTwo);

        userRepository.saveAll(Arrays.asList(userOne, userTwo));
        orderRepository.saveAll(Arrays.asList(orderOne, orderTwo, orderThree));
    }
}
