package br.com.fiap.bean;

import javax.swing.*;

public class ContaBancaria {
    //atributos
    private String cliente;
    private int numConta;
    private float saldo;

    // construtor
    public ContaBancaria() {
    }

    public ContaBancaria(String cliente, int numConta, float saldo) {
    }

    // get e set
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

    // metodos particulares
    public float sacar (float valor) {
        float saldoRestante = saldo;
        if (valor <= saldo) {
            saldoRestante = saldo - valor;
        }else{
            JOptionPane.showMessageDialog(null, String.format("O valor inserido ultrapassa o seu saldo bancário por favor inserir um valor <= %.2f", saldo));
//            System.exit(0);
        }
        return saldoRestante;
    }

    public float depositar (float valor) {
        return saldo + valor;
    }
}
