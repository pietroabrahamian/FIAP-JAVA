package br.com.fiap.bean;

public class Adicao {
    // atributos
    private int numInteiro1, numInteiro2;
    private double numReal1, numReal2;

    // construtor
    public Adicao() {
    }

    // get e set
    public int getNumInteiro1() {
        return numInteiro1;
    }

    public void setNumInteiro1(int numInteiro1) {
        this.numInteiro1 = numInteiro1;
    }

    public int getNumInteiro2() {
        return numInteiro2;
    }

    public void setNumInteiro2(int numInteiro2) {
        this.numInteiro2 = numInteiro2;
    }

    public double getNumReal1() {
        return numReal1;
    }

    public void setNumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }

    public double getNumReal2() {
        return numReal2;
    }

    public void setNumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }

    // métodos particulares
    public int somar (int n1, int n2){
        setNumInteiro1(n1);
        setNumInteiro2(n2);
        return numInteiro1 + numInteiro2;
    }
    public double somar (double n1, double n2){
        setNumReal1(n1);
        setNumReal2(n2);
        return numReal1 + numReal2;
    }
}
