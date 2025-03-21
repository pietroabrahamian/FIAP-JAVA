package br.com.fiap;

import java.util.Scanner;

public class Ex02Scanner {
    public static void main(String[] args) {
        int anoNascimento, idade;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.print("Digite o ano do seu nascimento: ");
            anoNascimento = scan.nextInt();
            idade = 2025 - anoNascimento;
            System.out.println("Você possui: " + idade + " anos.");
        } catch (Exception e) {
            System.out.println("Ano inválido!");
        }
    }
}
