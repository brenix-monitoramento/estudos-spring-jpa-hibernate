package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity // define uma entidade do banco de dados
public class Pessoa {
    @Id // define a coluna sendo id
    @Column(name="id") // name cria um nome personalizado para a tabela no banco de dados
    private Integer id;
    @Column(name="nome")
    private String nome;
    @Column(name="email")
    private String email;

    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String id) {
        this.email = email;
    }
}
