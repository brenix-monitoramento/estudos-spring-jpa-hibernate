package com.projetos.projeto_curso.services;

import com.projetos.projeto_curso.entities.User;
import com.projetos.projeto_curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listAll() {
        return userRepository.findAll();
    }

    public User listById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        return user.get();
    }
}
