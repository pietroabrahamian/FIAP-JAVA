package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {
    // atributos
    private String nome;
    private int anoNascimento;

    // construtores
    public Pessoa() {
    }
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
//        this.anoNascimento = anoNascimento;
        setAnoNascimento(anoNascimento);
    }

    // get / set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        LocalDate dataAtual = LocalDate.now();
        int ano = dataAtual.getYear();
        try{
            if (anoNascimento >= 1900 && anoNascimento <= ano){
                this.anoNascimento = anoNascimento;
            } else{
                throw new Exception("valor inválido! (min 1900 até max = Ano Atual");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    // métodos da particulares da classe
    public int calcularIdade (int anoAtual){
        return anoAtual - anoNascimento;
    }
}
