package com.db.anotacoestreinamento.heranca.joined;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor extends Usuario {
    
    private double salario;

    protected Professor(){

    }

    public Professor(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
