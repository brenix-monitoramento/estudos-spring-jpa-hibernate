package com.projetos.projeto_curso.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "\"order\"")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Order() {

    }

    public Order(Long id, Instant moment, User user) {
        this.id = id;
        this.moment = moment;
        this.user = user;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return this.moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
