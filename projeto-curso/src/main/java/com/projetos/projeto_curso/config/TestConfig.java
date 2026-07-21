package com.projetos.projeto_curso.config;

import com.projetos.projeto_curso.entities.Category;
import com.projetos.projeto_curso.entities.Order;
import com.projetos.projeto_curso.entities.Product;
import com.projetos.projeto_curso.entities.User;
import com.projetos.projeto_curso.enums.OrderStatus;
import com.projetos.projeto_curso.repositories.CategoryRepository;
import com.projetos.projeto_curso.repositories.OrderRepository;
import com.projetos.projeto_curso.repositories.ProductRepository;
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
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) {
        // Instâncias de usuários
        User userOne = new User(null, "John", "john@mail.com", "34343243", "123abc");
        User userTwo = new User(null, "Marie", "marie@mail.com", "6576576", "567abc");

        // Instâncias de pedidos
        Order orderOne = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, userOne);
        Order orderTwo = new Order(null, Instant.now(), OrderStatus.CANCELED, userOne);
        Order orderThree = new Order(null, Instant.now(), OrderStatus.DELIVERED, userTwo);

        // Instâncias de categorias
        Category categoryOne = new Category(null, "Electronics");
        Category categoryTwo = new Category(null, "Books");
        Category categoryThree = new Category(null, "Computers");

        // Instâncias de produtos
        Product productOne = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product productTwo = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product productThree = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product productFour = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product productFive = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        userRepository.saveAll(Arrays.asList(userOne, userTwo));
        orderRepository.saveAll(Arrays.asList(orderOne, orderTwo, orderThree));
        categoryRepository.saveAll(Arrays.asList(categoryOne, categoryTwo, categoryThree));
        productRepository.saveAll(Arrays.asList(productOne, productTwo, productThree, productFour, productFive));
    }
}
