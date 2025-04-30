// Pietro Ferreira Gomes Abrahamian RM: 561469, Gabriel Martins RM: 562194, Orlando Gonçalves RM: 561584
package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        // declarando e instanciando
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3;
        Aluno aluno4;
        String janela;
        LocalDate dataAtual;

        // armazenando a data de hoje em uma variável
        dataAtual = LocalDate.now();

        // aluno 1
        aluno1.setNomeCompleto("Pietro Ferreira Gomes Abrahamian");
        aluno1.setRegistroMatricula(561469);
        aluno1.setAnoDeNascimento(2007);

        // aluno 2
        aluno2.setNomeCompleto("Gabriel Lourenço Martins");
        aluno2.setRegistroMatricula(562194);
        aluno2.setAnoDeNascimento(2006);

        // variaveis de apoio do aluno3
        String nomeCompleto3;
        int matricula3, anoDeNascimento3;

        // variaveis de apoio do aluno4
        String nomeCompleto4;
        int matricula4, anoDeNascimento4;


        try{
            // informações aluno 3
            JOptionPane.showMessageDialog(null, "Olá, seja muito bem vindo! Por favor poderia nos dar algumas informações sobre os alunos 3 e 4? \n Vamos começar pleo aluno3.");
            janela = JOptionPane.showInputDialog("Qual o seu nome completo?");
            nomeCompleto3 = janela;
            janela = JOptionPane.showInputDialog("Digite a sua matricula:");
            matricula3 = Integer.parseInt(janela);
            janela = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
            anoDeNascimento3 = Integer.parseInt(janela);
            aluno3 = new Aluno(matricula3, anoDeNascimento3, nomeCompleto3);

            // informações aluno 4
            JOptionPane.showMessageDialog(null, "Agora vamos captar as informações do aluno4");
            janela = JOptionPane.showInputDialog("Qual o seu nome completo?");
            nomeCompleto4 = janela;
            janela = JOptionPane.showInputDialog("Digite a sua matricula:");
            matricula4 = Integer.parseInt(janela);
            janela = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
            anoDeNascimento4 = Integer.parseInt(janela);
            aluno4 = new Aluno(matricula4, anoDeNascimento4, nomeCompleto4);

            // mensagem final
            String mensagemFinal = String.format("Agora que sabemos todas as informações desse grupo, deixa eu te mostrar um panorama geral: \nALUNO 1: \nNome Completo: %s \nMatrícula: %d \nAno de Nascimento: %d \nALUNO 2: \nNome Completo: %s \nMatrícula: %d \nAno de Nascimento: %d \nALUNO 3: \nNome Completo: %s \nMatrícula: %d \nAno de Nascimento: %d \nALUNO 4: \nNome Completo: %s \nMatrícula: %d \nAno de Nascimento: %d", aluno1.getNomeCompleto(), aluno1.getRegistroMatricula(), aluno1.calcularIdade(dataAtual), aluno2.getNomeCompleto(), aluno2.getRegistroMatricula(), aluno2.calcularIdade(dataAtual), aluno3.getNomeCompleto(), aluno3.getRegistroMatricula(), aluno3.calcularIdade(dataAtual), aluno4.getNomeCompleto(), aluno4.getRegistroMatricula(), aluno4.calcularIdade(dataAtual));
            JOptionPane.showMessageDialog(null, mensagemFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor insira valores válidos");
        }

    }
}
