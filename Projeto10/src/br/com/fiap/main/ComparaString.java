package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog(("Digite sua senha"));
        if (senha.equals("P4ssw0rd")) {
            JOptionPane.showMessageDialog(null, "Acesso conedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
        if (senha.equalsIgnoreCase("P4ss0rd")){
            JOptionPane.showMessageDialog(null, "Login permitido");
        } else {
            JOptionPane.showMessageDialog(null, "Login não permitido");
        }

    }
}
