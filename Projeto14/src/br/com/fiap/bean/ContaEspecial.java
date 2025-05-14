package br.com.fiap.bean;

import javax.swing.*;

public class ContaEspecial extends ContaBancaria{
    // atributos
    private float limite;

    // construtores
    public ContaEspecial() {
    }

    public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    //set get
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    // metodos particulares
    public float sacar (float valor) {
        float novoSaldo = 0;
        float saldoLimite = super.getSaldo() + limite;
        if (valor <= saldoLimite){
            novoSaldo = valor - super.getSaldo();
        } else {
            JOptionPane.showMessageDialog(null, String.format("O valor inserido ultrapassa o seu saldo bancário e seu limite por favor inserir um valor <= %.2f", saldoLimite));
        }
        return novoSaldo;
    }
}
