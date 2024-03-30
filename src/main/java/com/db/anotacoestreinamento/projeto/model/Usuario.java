package com.db.anotacoestreinamento.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 127, nullable = false)
    private String nome;

    @Column(name = "dataDeNascimento", nullable = false)
    private LocalDate dataDeNascimento;

    @Column(name = "email", unique = true, nullable = false)
    private String email;
    
    protected Usuario(){
    }

    public Usuario(String nome, LocalDate dataDeNascimento, String email){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
    }

    public Long getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public String getEmail() {
        return this.email;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
