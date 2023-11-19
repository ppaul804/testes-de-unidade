package br.com.alura.tdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculadoraTestes {
    private static Logger log = LoggerFactory.getLogger(CalculadoraTestes.class);

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
        log.info("soma = {}", soma);
        soma = calc.somar(3, 0);
        log.info("soma = {}", soma);
        soma = calc.somar(0, 0);
        log.info("soma = {}", soma);
        soma = calc.somar(3, -1);
        log.info("soma = {}", soma);
    }
}