package com.db.anotacoestreinamento.geracaoId.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, 
                    generator = "table-generator")
    @TableGenerator(name = "table-generator", 
                    table = "dep_ids", 
                    pkColumnName = "seq_id", 
                    valueColumnName = "seq_value")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;
    
    protected Usuario(){
    }

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId(){
        return this.id;
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
