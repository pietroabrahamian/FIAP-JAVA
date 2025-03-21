package br.com.fiap;

import javax.swing.*;

public class Ex02JOp {
    public static void main(String[] args) {
        int anoNascimento, idade;
        String janela;

        try {
            janela = JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
            anoNascimento = Integer.parseInt(janela);
            idade = 2025 -anoNascimento;
            JOptionPane.showMessageDialog(null, "Você possui " + idade + " anos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ano inválido!");
        }
    }
}
