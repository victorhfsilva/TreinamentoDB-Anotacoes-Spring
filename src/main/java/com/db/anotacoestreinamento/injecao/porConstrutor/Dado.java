package com.db.anotacoestreinamento.injecao.porConstrutor;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Dado {

    private final Random random = new Random();

    public int lancar() {
        return random.nextInt(6) + 1;
    }
}