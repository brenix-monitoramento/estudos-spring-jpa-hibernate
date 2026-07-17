package com.projetos.projeto_curso.controllers;

import com.projetos.projeto_curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        var user1 = new User(1L, "Breno", "breno@mail.com", "999999", "12345.");
        var user2 = new User(2L, "Luana", "luana@mail.com", "454545", "65765867.");

        var users = Arrays.asList(user1, user2);

        return ResponseEntity.ok().body(users);
    }
}
