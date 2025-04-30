package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gestante;
        String nome, auxiliar, dataEUA;
        LocalDate dataDeGestacao;

        try{
            nome = JOptionPane.showInputDialog("Digite o seu nome");
            auxiliar = JOptionPane.showInputDialog("Digite a data do inicio da gestação");
            // arrumando a data
            String ano = auxiliar.substring(6,10);
            String mes = auxiliar.substring(3,5);
            String dia = auxiliar.substring(0,2);
            dataEUA = ano + "-" + mes + "-" + dia;
            dataDeGestacao = LocalDate.parse(dataEUA);

            gestante = new Gestante(nome, dataDeGestacao);

            JOptionPane.showMessageDialog(null, String.format("Data formato EUA \nData de Gestação: %s", gestante.getDataDeGestacao()));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            JOptionPane.showMessageDialog(null, String.format("Dados Pessoas \nNome: %s \nData de Gestação: %s \nTempo de Gestação: %d meses", gestante.getNome(), gestante.getDataDeGestacao().format(dtf), gestante.tempoDeGestacao()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
