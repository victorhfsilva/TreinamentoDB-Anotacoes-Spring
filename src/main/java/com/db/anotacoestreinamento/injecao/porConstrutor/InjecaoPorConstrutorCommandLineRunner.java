package com.db.anotacoestreinamento.injecao.porConstrutor;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class InjecaoPorConstrutorCommandLineRunner implements CommandLineRunner {

    private Dado dado;

    @Autowired
    public InjecaoPorConstrutorCommandLineRunner(Dado dado) {
        this.dado = dado;
    }

    private static final Logger logger = LoggerFactory.getLogger(InjecaoPorConstrutorCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Primeiro lancamento do dado: " + dado.lancar());
    }
    
}
