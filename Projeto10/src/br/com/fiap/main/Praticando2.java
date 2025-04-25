package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.parse;

public class Praticando2 {
    public static void main(String[] args) {
        try{
            String dataInicial = JOptionPane.showInputDialog("Digite uma data inicial (dd/mm/aaaa):");
            String dataInicialEUA = String.format("%s-%s-%s", dataInicial.substring(6,10),dataInicial.substring(3,5), dataInicial.substring(0,2));
            LocalDate dataInicialTratada = LocalDate.parse(dataInicialEUA);

            String dataFinal = JOptionPane.showInputDialog("Digite uma data final (dd/mm/aaaa):");
            String dataFinalEUA = String.format("%s-%s-%s", dataFinal.substring(6,10),dataFinal.substring(3,5), dataFinal.substring(0,2));
            LocalDate dataFinalTratada = LocalDate.parse(dataFinalEUA);

            Period periodo = Period.between(dataInicialTratada, dataFinalTratada);

            JOptionPane.showMessageDialog(null, String.format("Data inicial: %s \nData final: %s \n Entre as datas fornecidas existem: %d ano(s), %d mês(es) e %d dia(s)", dataInicial, dataFinal, periodo.getYears(), periodo.getMonths(), periodo.getDays()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
