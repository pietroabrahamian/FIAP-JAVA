package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;
import java.util.Scanner;

public class MainFunc2 {
    public static void main(String[] args) {
        Funcionario func2;
        Scanner scan;
        LocalDate dataAtual = LocalDate.now();
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e o valor da hora trabalhada:");
            func2 = new Funcionario(scan.nextLine(), scan.nextFloat());
            System.out.printf("Olá, %s. \nSeu valor de hora é: %.1f \nSeu salário é: %.2f \nData: %d/%d/%d", func2.getNome(), func2.getValorHoraTrabalho(), func2.calcularSalario(30), dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), dataAtual.getYear());
        } catch (Exception e) {
            System.out.println("Valor Inserido inválido.");
        }
    }
}
