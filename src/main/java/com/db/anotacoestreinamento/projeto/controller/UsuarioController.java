package com.db.anotacoestreinamento.projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.anotacoestreinamento.projeto.dto.UsuarioDTO;
import com.db.anotacoestreinamento.projeto.mapper.UsuarioMapper;
import com.db.anotacoestreinamento.projeto.model.Usuario;
import com.db.anotacoestreinamento.projeto.service.UsuarioService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> salvar(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.mapDtoToEntity(usuarioDTO);
        Usuario usuarioSalvo = usuarioService.salvar(usuario);
        return ResponseEntity.created(null).body(usuarioSalvo);
    }

    @GetMapping("/buscar/email")
    public ResponseEntity<Usuario> buscarPorEmail(@RequestParam("email") String email){
        Usuario usuario = usuarioService.buscarPorEmail(email);
        return ResponseEntity.ok().body(usuario);
    }

    @GetMapping("/buscar/nome")
    public ResponseEntity<List<Usuario>> buscarPorNomeContendo(@RequestParam("nome") String nome){
        List<Usuario> usuarios = usuarioService.buscarPorNomeContendo(nome);
        return ResponseEntity.ok().body(usuarios);
    }
    
    @GetMapping("/isMaiorDeIdade")
    public ResponseEntity<Boolean> isMaiorDeIdade(@RequestParam("email") String email){
        boolean isMaiorDeIdade = usuarioService.isMaiorDeIdade(email);
        return ResponseEntity.ok().body(isMaiorDeIdade);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Usuario> atualizar(@RequestParam("email") String email, @RequestBody UsuarioDTO novoUsuarioDTO){
        Usuario novoUsuario = UsuarioMapper.mapDtoToEntity(novoUsuarioDTO);
        Usuario usuarioAtualizado = usuarioService.atualizar(email, novoUsuario);
        return ResponseEntity.ok().body(usuarioAtualizado);
    }

    @DeleteMapping("/deletar/email")
    public ResponseEntity<Usuario> deletar(@RequestParam("email") String email){
        Usuario usuario = usuarioService.deletarPorEmail(email);
        return ResponseEntity.ok().body(usuario);
    }
}
