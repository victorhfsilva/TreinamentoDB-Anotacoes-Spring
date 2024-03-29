package com.db.anotacoestreinamento.geracaoId.table;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
public class TableCommandLineRunner implements CommandLineRunner {

    private UsuarioRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(TableCommandLineRunner.class);

    public TableCommandLineRunner(UsuarioRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Usuario joao = new Usuario("João", 28);        
        repository.save(joao);
        logger.info("João foi salvo.");

        Usuario joana = new Usuario("Joana", 24);
        repository.save(joana);
        logger.info("Joana foi salva.");

        Usuario josefina = new Usuario("Josefina", 32);
        repository.save(josefina);
        logger.info("Josefina foi salva.");
    }
    
}
