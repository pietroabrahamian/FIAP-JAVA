package br.com.fiap.bean;

/**
 * Classe para criar objetos do tipo ContaPoupança
 */
public class ContaPoupanca implements ContaBancaria {
    // atributos
    private int numConta;
    private float saldo;

    // construtor
    public ContaPoupanca() {
    }

    // set e get
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

    /**
     * Metodo sacar que permite savar um valor informado
     * Valor informado nao deve ser superiror ao saldo atual
     * @author FLunao
     * @param valor indica valor a ser sacado
     * @return float - valor do saldo
     */
    public  float sacar(float valor){
        try {
            if (valor <= saldo){
                saldo -= valor;
            } else {
                throw  new Exception("Saldo Insuficiente");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    public float depositar(float valor){
        return saldo + valor;
    }
}
