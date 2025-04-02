package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        String janela;
        try{
            janela = JOptionPane.showInputDialog("Qual o seu salário bruto?");
            salarioBruto = Double.parseDouble(janela);
            janela = JOptionPane.showInputDialog("Quantos dependentes do seu Plano de Saúde você possui?");
            numeroDeDependentes = Integer.parseInt(janela);
            janela = JOptionPane.showInputDialog("De acordo com o seu salário, qual seria a porcentagem do desconto do INSS?");
            descontoINSS = Double.parseDouble(janela);
            janela = JOptionPane.showInputDialog("Qual o valor do seu Plano de Saúde?");
            valorPlanoDeSaude = Double.parseDouble(janela);
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;
            String mensagem = String.format("Salário Bruto: R$ %.2f \nN° de Dependendtes: %d \nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f",folha.salarioBruto, folha.numeroDeDependentes,  folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos!");
        }
    }

}
