package br.com.fiap.bean;

public class Retangulo extends Quadrado{
    // atributos
    private float altura;

    // construtores
    public Retangulo () {}

    public Retangulo(float lado, float altura) {
        super(lado);
        this.altura = altura;
    }

    // set e get
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // metodos particulares
    public float calcularArea() {
        return  super.getLado() * altura / 2;
    }
}
