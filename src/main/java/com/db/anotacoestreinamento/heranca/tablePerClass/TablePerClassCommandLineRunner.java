package com.db.anotacoestreinamento.heranca.tablePerClass;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
public class TablePerClassCommandLineRunner implements CommandLineRunner {

    private UsuarioRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(TablePerClassCommandLineRunner.class);

    public TablePerClassCommandLineRunner(UsuarioRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Aluno joao = new Aluno("João", 28, "AL001");        
        repository.save(joao);
        logger.info("João foi salvo.");

        Professor joana = new Professor("Joana", 24, 6459.99);
        repository.save(joana);
        logger.info("Joana foi salva.");

        Usuario josefina = new Usuario("Josefina", 24);
        repository.save(josefina);
        logger.info("Josefina foi salva.");
    }
    
}
