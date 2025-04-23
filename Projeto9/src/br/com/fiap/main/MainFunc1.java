package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.setValorHoraTrabalho(100.00f);
        func1.setNome("Pietro");
        float salario = func1.calcularSalario(30);
        LocalDate dataAtual = LocalDate.now();



        System.out.printf("Olá %s, o valor da hora é %.0f. \nSeu salário é R$ %.2f \nData: %d/%s/%d", func1.getNome(), func1.getValorHoraTrabalho(), salario, dataAtual.getDayOfMonth(), dataAtual.getMonth(), dataAtual.getYear());

    }
}
