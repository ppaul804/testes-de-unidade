package br.com.alura.tdd.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

    public void reajustarSalario(BigDecimal reajuste) {
        this.salario = this.salario.add(reajuste);
    }
}
