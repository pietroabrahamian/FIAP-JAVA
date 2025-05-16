package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        int numConta, opcao;
        float saldo, valor;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Digite o número da conta poupança?");
                numConta = Integer.parseInt(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Digite o valor do saldo: ");
                saldo = Float.parseFloat(auxiliar);
                ContaPoupanca cp = new ContaPoupanca();
                cp.setNumConta(numConta);
                cp.setSaldo(saldo);
                auxiliar = JOptionPane.showInputDialog("Escolha a operação: \n(1) Saque \n(2) Depósito");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor a ser sacado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("dados da Conta \nnúmero da Conta: %d \nSaldo Atual> R$ %.2f", cp.getNumConta(), cp.sacar(valor )));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor a ser depositado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("dados da Conta \nnúmero da Conta: %d \nSaldo Atual> R$ %.2f", cp.getNumConta(), cp.depositar(valor )));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            escolha = JOptionPane.showInputDialog("Deseja continuar? ");

        }
            JOptionPane.showInputDialog(null, "Fim de Programa!")
    }
}
