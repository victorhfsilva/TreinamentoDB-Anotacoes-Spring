package com.db.anotacoestreinamento.projeto.mapper;

import com.db.anotacoestreinamento.projeto.dto.UsuarioDTO;
import com.db.anotacoestreinamento.projeto.model.Usuario;

public class UsuarioMapper {
    
    public static Usuario mapDtoToEntity(UsuarioDTO usuarioDTO){
        return new Usuario(usuarioDTO.nome(), 
                            usuarioDTO.dataDeNascimento(),
                            usuarioDTO.email());
    }
}
