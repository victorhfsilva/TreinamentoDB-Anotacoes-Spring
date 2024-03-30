package com.db.anotacoestreinamento.projeto.dto;

import java.time.LocalDate;

public record UsuarioDTO(String nome, LocalDate dataDeNascimento, String email) {
    
}
