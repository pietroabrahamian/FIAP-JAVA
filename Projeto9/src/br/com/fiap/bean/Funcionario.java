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
//        this.valorHoraTrabalho = valorHoraTrabalho;
        setValorHoraTrabalho(valorHoraTrabalho);
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
        try{
            if (valorHoraTrabalho > 0){
                this.valorHoraTrabalho = valorHoraTrabalho;
            } else {
                throw new Exception("Valor Inválido!! ( hora > 0)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // métodos da particulares da classe
    public float calcularSalario(float qtdeHorasTrabalhadaSemana){
        return (valorHoraTrabalho * qtdeHorasTrabalhadaSemana) * 4;
    }
}
