package com.projetos.projeto_curso.config;

import com.projetos.projeto_curso.entities.User;
import com.projetos.projeto_curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) {
        User userOne = new User(null, "John", "john@mail.com", "34343243", "123abc");
        User userTwo = new User(null, "Marie", "marie@mail.com", "6576576", "567abc");

        userRepository.saveAll(Arrays.asList(userOne, userTwo));
    }
}
