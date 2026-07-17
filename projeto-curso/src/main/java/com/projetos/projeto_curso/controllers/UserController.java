package com.projetos.projeto_curso.controllers;

import com.projetos.projeto_curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        var user1 = new User(1L, "Breno", "breno@mail.com", "999999", "12345.");
        var user2 = new User(2L, "Luana", "luana@mail.com", "454545", "65765867.");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        return ResponseEntity.ok().body(users);
    }
}
