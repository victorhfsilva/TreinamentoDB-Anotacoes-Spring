package com.db.anotacoestreinamento.injecao.porSetter;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class InjecaoPorSetterCommandLineRunner implements CommandLineRunner {

    private Dado dado;

    private static final Logger logger = LoggerFactory.getLogger(InjecaoPorSetterCommandLineRunner.class);

    @Autowired
    public void setDado(Dado dado) {
        this.dado = dado;
    }
    
    @Override
    public void run(String... args) throws Exception {
        logger.info("Primeiro lancamento do dado: " + dado.lancar());
    }
    
}
