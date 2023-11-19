package br.com.alura.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculadoraTest {
    @Test
    void deveriaSomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 7);
        assertEquals(10, resultado);
    }
}
