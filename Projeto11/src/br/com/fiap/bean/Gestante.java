package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Gestante {
    // atributos
    private String nome;
    private LocalDate dataDeGestacao;

    // construtores
    public Gestante() {
    }
    public Gestante(String nome, LocalDate dataDeGestacao) {
        this.nome = nome;
        setDataDeGestacao(dataDeGestacao);
    }

    // get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeGestacao() {
        return dataDeGestacao;
    }

    public void setDataDeGestacao(LocalDate dataDeGestacao) {
        try{
            LocalDate dataAtual = LocalDate.now();
            int mesAtual = dataAtual.getMonthValue();
            int mesGestacao = dataDeGestacao.getMonthValue();
            if (mesAtual - mesGestacao <= 9){
                this.dataDeGestacao = dataDeGestacao;
            } else {
                throw new Exception("Nesse tempo o bebê ja nasceu!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }

    }

    // métodos particulres da classe
    public int tempoDeGestacao(){
        LocalDate gestacao = LocalDate.now();
        Period periodoGestacao = Period.between(dataDeGestacao, gestacao);
        return periodoGestacao.getMonths();
    }
}
