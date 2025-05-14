package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria{
    // atributos
    private int diaDeRendimento;

    // construtor
    public ContaPoupanca() {
    }

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    //set e get
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento){
    this.diaDeRendimento = diaDeRendimento;
    }

    // metodos particulares
    public float novoSaldo (float rendimento) {
        return super.getSaldo() + super.getSaldo()*(rendimento/100);
    }
}
