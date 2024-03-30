package com.db.anotacoestreinamento.projeto.service.interfaces;


import java.util.List;

import com.db.anotacoestreinamento.projeto.model.Usuario;

public interface IUsuarioService {
    Usuario salvar(Usuario usuario);
    Usuario buscarPorEmail(String email);
    List<Usuario> buscarPorNomeContendo(String nome);
    boolean isMaiorDeIdade(String email);
    Usuario atualizar(String email, Usuario novUsuario);
    Usuario deletarPorEmail(String email);
}
