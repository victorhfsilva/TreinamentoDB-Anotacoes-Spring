package com.db.anotacoestreinamento.projeto.service;

import java.util.List;
import java.time.LocalDate;
import org.springframework.stereotype.Service;
import java.time.Period;
import com.db.anotacoestreinamento.projeto.model.Usuario;
import com.db.anotacoestreinamento.projeto.repository.UsuarioRepository;
import com.db.anotacoestreinamento.projeto.service.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario buscarPorEmail(String email) {
       return usuarioRepository.findByEmail(email).orElseThrow();
    }

    @Override
    public List<Usuario> buscarPorNomeContendo(String nome) {
        return usuarioRepository.findByNameContaining(nome);
    }

    @Override
    public boolean isMaiorDeIdade(String email) {
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow();
        LocalDate dataDeNascimento = usuario.getDataDeNascimento();
        Period periodo = Period.between(dataDeNascimento, LocalDate.now());
        int idade = periodo.getYears();
        return idade > 18;
    }

    @Override
    public Usuario atualizar(String email, Usuario novUsuario) {
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow();
        usuario.setDataDeNascimento(novUsuario.getDataDeNascimento());
        usuario.setEmail(novUsuario.getEmail());
        usuario.setNome(novUsuario.getNome());
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario deletarPorEmail(String email) {
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow();
        usuarioRepository.delete(usuario);
        return usuario;
    }
    
}
