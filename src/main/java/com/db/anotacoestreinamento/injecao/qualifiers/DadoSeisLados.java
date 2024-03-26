package com.db.anotacoestreinamento.injecao.qualifiers;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dadoSeisLados") 
public class DadoSeisLados implements Dado{

    private final Random random = new Random();

    public int lancar() {
        return random.nextInt(6) + 1;
    }
}