// Pietro Ferreira Gomes Abrahamian RM: 561469, Gabriel Martins RM: 562194, Orlando Gonçalves RM: 561584
package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    // atributos
    private int registroMatricula, anoDeNascimento;
    private String nomeCompleto;

    // construtores
    public Aluno() {
    }

    public Aluno(int registroMatricula, int anoDeNascimento, String nomeCompleto) {
//        this.registroMatricula = registroMatricula;
        setRegistroMatricula(registroMatricula);
//        this.anoDeNascimento = anoDeNascimento;
        setAnoDeNascimento(anoDeNascimento);
        this.nomeCompleto = nomeCompleto;
    }

    // get e set
    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999){
                this.registroMatricula = registroMatricula;
            }else {
                throw new Exception("Valor inválido!! (min = 80000 e max = 599999");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        LocalDate dataAtual = LocalDate.now();
        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear()){
                this.anoDeNascimento = anoDeNascimento;
            }else {
                throw new Exception("Valor Inválido!! (min = 1945 e max = ano atual");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    // metódos particulares
    public int calcularIdade(LocalDate dataAtual){
        return dataAtual.getYear() - anoDeNascimento;
    }
}
