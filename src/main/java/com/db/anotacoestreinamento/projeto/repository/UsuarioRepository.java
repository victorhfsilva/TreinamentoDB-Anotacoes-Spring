package com.db.anotacoestreinamento.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.db.anotacoestreinamento.projeto.model.Usuario;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    Optional<Usuario> findByEmail(String email);

    @Query("SELECT u FROM Usuario u WHERE u.nome LIKE %:nome%")
    List<Usuario> findByNameContaining(@Param("nome") String nome);
}
