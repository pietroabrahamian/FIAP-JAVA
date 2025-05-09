package br.com.fiap.bean;

public class Quadrado {
    // atributos
    private float lado;

    // construtores
    public Quadrado(){}

    public Quadrado(float lado) {
        this.lado = lado;
    }

    //set e get
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    // metodos particulares
    public float calcularArea () {
        return lado * lado;
    }
}
