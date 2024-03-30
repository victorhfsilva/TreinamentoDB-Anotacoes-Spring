package com.db.anotacoestreinamento.heranca.mappedsuperclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario extends BaseEntity{


    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;
    
    protected Usuario(){
    }

    public Usuario(String nome, int idade){
        setAtivo(true);
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
