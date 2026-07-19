package com.projetos.projeto_curso.controllers;

import com.projetos.projeto_curso.entities.User;
import com.projetos.projeto_curso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        var users = userService.listAll();

        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity<User> getById(@PathVariable Long userId) {
        var user = userService.listById(userId);
        return ResponseEntity.ok().body(user);
    }
}
