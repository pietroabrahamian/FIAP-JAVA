package br.com.fiap.bean;

public class Funcionario {
    // atributos
    private String nome;
    private float valorHoraTrabalho;

    // construtores
    public Funcionario() {
    }
    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    // set e get
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    // metodos particulares
    public float calcularSalario() {
        return (valorHoraTrabalho * 40) * 4;
    }
}
