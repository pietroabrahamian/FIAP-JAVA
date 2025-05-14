package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaPoupanca;


import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class MainConta {
    public static void main(String[] args) {
        String cliente, auxiliar, escolha = "sim";
        int numConta,diaDeRendimento, opcao, dia;
        float saldo, limite, valor, rendimento;
        LocalDate dataAtual = LocalDate.now();
        ContaBancaria cb = new ContaBancaria();
        ContaPoupanca cp = new ContaPoupanca();


        dia = dataAtual.getDayOfMonth();

            while (escolha.equalsIgnoreCase("sim")) {
                try {
                    auxiliar = JOptionPane.showInputDialog("Qual seu tipo? \n(1) Conta Bancária Padrão \n(2) Conta Poupança \n(3) Conta Especial");
                    opcao = Integer.parseInt(auxiliar);

                    cliente = JOptionPane.showInputDialog("Seja muito bem vindo ao seu programa! \nQual o seu nome?");
                    auxiliar = JOptionPane.showInputDialog("Qual o número da sua conta?");
                    numConta = Integer.parseInt(auxiliar);
                    auxiliar = JOptionPane.showInputDialog("Qual o seu saldo?");
                    saldo = Float.parseFloat(auxiliar);
                    cb.setCliente(cliente);
                    cb.setNumConta(numConta);
                    cb.setSaldo(saldo);

                    switch (opcao) {
                        case 1:
                            auxiliar = JOptionPane.showInputDialog("Você deseja: \n(1) Sacar \n(2) Depositar");
                            opcao = Integer.parseInt(auxiliar);
                            if (opcao == 1) {
                                auxiliar = JOptionPane.showInputDialog("Qual valor deseja sacar?");
                                valor = Float.parseFloat(auxiliar);
                                JOptionPane.showMessageDialog(null, String.format("Seu saldo atual é de R$ %.2f, o seu saque é de R$ %.2f logo seu saldo restante é de: R$ %.2f", cb.getSaldo(), valor, cb.sacar(valor)));
                                JOptionPane.showMessageDialog(null, String.format("Seus dados: \nCliente: %s \nNúmero da Conta: %d \nSaldo: R$ %.2f", cb.getCliente(), cb.getNumConta(), cb.sacar(valor)));
                            } else if (opcao == 2){
                                auxiliar = JOptionPane.showInputDialog("Qual valore deseja depositar?");
                                valor = Float.parseFloat(auxiliar);
                                JOptionPane.showMessageDialog(null, String.format("Seu saldo atual é de R$ %.2f, o seu depósito é de R$ %.2f logo seu saldo atual é de: R$ %.2f", cb.getSaldo(), valor, cb.depositar(valor)));
                                JOptionPane.showMessageDialog(null, String.format("Seus dados: \nCliente: %s \nNúmero da Conta: %d \nSaldo: R$ %.2f", cb.getCliente(), cb.getNumConta(), cb.depositar(valor)));
                            } else {
                                throw new Exception("Escolha incorreta!");
                            }
                            break;

                        case 2:
                            auxiliar = JOptionPane.showInputDialog("Qual o dia de rendimento da sua poupança?");
                            diaDeRendimento = Integer.parseInt(auxiliar);
                            cp.setDiaDeRendimento(diaDeRendimento);
                            auxiliar = JOptionPane.showInputDialog("Qual a porcentagem do seu rendimento?");
                            rendimento = Float.parseFloat(auxiliar);

                            if (dia >= diaDeRendimento){
                                JOptionPane.showMessageDialog(null, String.format("Como já passou o dia do seu rendimento o seu saldo foi atulizado! \n De R$ %.2f para R$ %.2f", cb.getSaldo(), cp.novoSaldo(rendimento)));
                            } else {

                            }
                            break;
                        case 3:
                            break;

                        default:
                            throw new Exception("Escolha incorreta!");
                    }
                    escolha = JOptionPane.showInputDialog("Deseja continuar? ");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                JOptionPane.showMessageDialog(null, "Programa encerrado!");
            }
    }
}
