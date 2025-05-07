package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao add = new Adicao();
        int numInteiro1, numInteiro2, opcao;
        double numReal1, numReal2;
        String auxiliar, escolha = "sim";

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Escolha qual soma deseja fazer: \n(1) Números Inteiros \n(2) Números Reais");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro número para soma: ");
                        numInteiro1 = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o segundo número para soma: ");
                        numInteiro2 = Integer.parseInt(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %d + %d = %d", numInteiro1, numInteiro2, add.somar(numInteiro1, numInteiro2)));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro número para soma: ");
                        numReal1 = Double.parseDouble(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o segundo número para soma: ");
                        numReal2 = Double.parseDouble(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %f + %f = %.2f", numReal1, numReal2, add.somar(numReal1, numReal2)));
                        break;
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!");
    }
}
