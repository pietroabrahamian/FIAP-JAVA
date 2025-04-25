package br.com.fiap.main;

import javax.swing.*;

public class Praticando1 {
    public static void main(String[] args) {
        try{
            String frase = JOptionPane.showInputDialog("Digite uma frase:");
            JOptionPane.showMessageDialog(null, frase);
            JOptionPane.showMessageDialog(null, frase.length());
            JOptionPane.showMessageDialog(null, frase.toUpperCase());
            JOptionPane.showMessageDialog(null, frase.toLowerCase());

            String palavraExistente = JOptionPane.showInputDialog(String.format("Digite uma palavbra existente em sua frase para ser substituída: \nSua frase: %s", frase));
            String palavraNova = JOptionPane.showInputDialog("Agora escreva uma palavra para ser substituída:");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
