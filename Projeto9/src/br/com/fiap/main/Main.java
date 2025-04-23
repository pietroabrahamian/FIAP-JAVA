package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pietro");
        pessoa1.setAnoNascimento(100);
        int idadePessoa1 = pessoa1.calcularIdade(2025);

        Pessoa pessoa2 = new Pessoa("Isabelle", 2011);

        System.out.printf("Pessoa 1 \nNome: %s \nIdade: %d anos", pessoa1.getNome(), idadePessoa1);
        System.out.printf("Pessoa 2 \nNome: %s \nIdade: %d anos", pessoa2.getNome(), pessoa2.calcularIdade(2025));
    }
}
