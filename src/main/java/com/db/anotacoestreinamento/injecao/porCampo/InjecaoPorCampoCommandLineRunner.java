package com.db.anotacoestreinamento.injecao.porCampo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class InjecaoPorCampoCommandLineRunner implements CommandLineRunner {

    @Autowired
    private Dado dado;

    private static final Logger logger = LoggerFactory.getLogger(InjecaoPorCampoCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Primeiro lancamento do dado: " + dado.lancar());
    }
    
}
