package com.db.anotacoestreinamento.injecao.qualifiers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.db.anotacoestreinamento.injecao.porSetter.InjecaoPorSetterCommandLineRunner;

import org.slf4j.Logger;

@Component
public class QualifiersCommandLineRunner implements CommandLineRunner {

    private Dado dadoSeisLados;
    private Dado dadoVinteLados;

    private static final Logger logger = LoggerFactory.getLogger(InjecaoPorSetterCommandLineRunner.class);

    @Autowired
    public void setDado(@Qualifier("dadoSeisLados") Dado dadoSeisLados, @Qualifier("dadoVinteLados") Dado dadoVinteLados) {
        this.dadoSeisLados = dadoSeisLados;
        this.dadoVinteLados = dadoVinteLados;
    }
    
    @Override
    public void run(String... args) throws Exception {
        logger.info("Lancamento do dado de Seis Lados: " + dadoSeisLados.lancar());
        logger.info("Lancamento do dado de Vinte Lados: "+ dadoVinteLados.lancar());
    }
    
}
