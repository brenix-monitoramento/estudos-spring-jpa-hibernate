package com.projetos.projeto_curso.repositories;

import com.projetos.projeto_curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
