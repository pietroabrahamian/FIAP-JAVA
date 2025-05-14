package br.com.fiap.bean;

public class Resolucao {

}
package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class ContaBancaria {
    // atributos
    private String cliente;
    private int numConta;
    private float saldo;
    // construtores
    public ContaBancaria() {
    }
    // métodos getters/setters
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    // métodos da classe (particulares)
    public float sacar(float valor) {
        float novoSaldo = saldo;
        if (valor <= saldo) {
            novoSaldo = saldo - valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor superior ao seu saldo atual");
        }
        saldo = novoSaldo;
        return saldo;
    }
    public float depositar(float valor) {
        return saldo += valor;
    }
}

###################################################################################################

        package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria{
    // atributos
    private int diaDeRendimento;
    // construtores
    public ContaPoupanca() {
    }
    // métodos getters/setters
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    // métodos da classe (particulares)
    public float novoSaldo(float rendimento) {
        float novoSaldo = super.getSaldo() * (1 + rendimento / 100);
        super.setSaldo(novoSaldo);
        return super.getSaldo();
    }
}

###################################################################################################

        package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class ContaEspecial extends ContaBancaria{
    // atributos
    private float limite;
    // construtores
    public ContaEspecial() {
    }
    // métodos getters/setters
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    // métodos da classe (particulares)
    public float sacar(float valor) {
        float novoSaldo = super.getSaldo();
        if (valor <= (super.getSaldo() + limite)) {
            novoSaldo = super.getSaldo() - valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor superior ao seu limite atual");
        }
        super.setSaldo(novoSaldo);
        return super.getSaldo();
    }
}

###################################################################################################

        package br.com.fiap.main;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaEspecial;
import br.com.fiap.bean.ContaPoupanca;

public class MainConta {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim", cliente;
        int opcao, numConta, diaRendimento;
        float saldo, saque, deposito, limite;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual tipo de conta possui? \n(1) Normal \n(2)Poupança \n(3)Especial");
                opcao = Integer.parseInt(auxiliar);
                cliente = JOptionPane.showInputDialog("Digite seu nome");
                numConta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta:"));
                saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo da conta:"));
                switch (opcao) {
                    case 1:
                        ContaBancaria cb = new ContaBancaria();
                        cb.setCliente(cliente);
                        cb.setNumConta(numConta);
                        cb.setSaldo(saldo);
                        saque = Float.parseFloat(JOptionPane.showInputDialog("Saque:"));
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$ %.2f", cb.sacar(saque)));
                        deposito = Float.parseFloat(JOptionPane.showInputDialog("Depósito:"));
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$ %.2f", cb.depositar(deposito)));
                        JOptionPane.showMessageDialog(null, String.format("Exibindo informações: \nNome: %s  \nNúmero da conta: %d \nSaldo atual: R$ %.2f", cb.getCliente(), cb.getNumConta(), cb.getSaldo()));
                        break;
                    case 2:
                        diaRendimento = Integer.parseInt(JOptionPane.showInputDialog("Dia de Rendimento:"));
                        ContaPoupanca cp = new ContaPoupanca();
                        cp.setCliente(cliente);
                        cp.setNumConta(numConta);
                        cp.setSaldo(saldo);
                        cp.setDiaDeRendimento(diaRendimento);
                        saque = Float.parseFloat(JOptionPane.showInputDialog("Saque:"));
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$ %.2f", cp.sacar(saque)));
                        deposito = Float.parseFloat(JOptionPane.showInputDialog("Deposito:"));
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$ %.2f", cp.depositar(deposito)));
                        int dia = LocalDate.now().getDayOfMonth();
                        if (dia >= cp.getDiaDeRendimento()) {
                            float rend = Float.parseFloat(JOptionPane.showInputDialog("Qual a taxa de rendimento?"));
                            cp.novoSaldo(rend);
                        }
                        JOptionPane.showMessageDialog(null, String.format("Exibindo informações: \nNome: %s  \nNúmero da conta: %d \nSaldo atual: R$ %.2f", cp.getCliente(), cp.getNumConta(), cp.getSaldo()));
                        break;
                    case 3:
                        limite = Float.parseFloat(JOptionPane.showInputDialog("Limite:"));
                        ContaEspecial ce = new ContaEspecial();
                        ce.setCliente(cliente);
                        ce.setNumConta(numConta);
                        ce.setSaldo(saldo);
                        ce.setLimite(limite);
                        saque = Float.parseFloat(JOptionPane.showInputDialog("Saque:"));
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$ %.2f", ce.sacar(saque)));
                        deposito = Float.parseFloat(JOptionPane.showInputDialog("Deposito:"));
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$ %.2f", ce.depositar(deposito)));
                        JOptionPane.showMessageDialog(null, String.format("Exibindo informações: \nNome: %s  \nNúmero da conta: %d \nSaldo atual: R$ %.2f", ce.getCliente(), ce.getNumConta(), ce.getSaldo()));
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