package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        Scanner scan;
        // interação com o usuário
        try{
            scan = new Scanner(System.in);
            System.out.print("Qual o seu salário bruto? ");
            salarioBruto = scan.nextDouble();
            System.out.print("Quantos dependentes do seu Plano de Saúde você possui? ");
            numeroDeDependentes = scan.nextInt();
            System.out.print("De acordo com o seu salário, qual seria a porcentagem do desconto do INSS? ");
            descontoINSS = scan.nextDouble() ;
            System.out.print("Qual o valor do seu Plano de Saúde? ");
            valorPlanoDeSaude = scan.nextDouble();
            // atribuir os valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;
            // exibindo os valores e resultado
            System.out.printf("Salário Bruto: R$ %.2f \nN° de Dependendtes: %d \nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f",folha.salarioBruto, folha.numeroDeDependentes,  folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());

        } catch (Exception e) {
            System.out.println("Por favor, insira números válidos!");
        }
    }
}
