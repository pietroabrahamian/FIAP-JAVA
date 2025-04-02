// Pietro Abrahamian RM: 561469, Gabriel Martins RM: 562194, Orlando Gonçalves RM: 561584
package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
        int numeroDeMoradores;
        DespesaFamiliar df = new DespesaFamiliar();
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite o valor da Renda Familiar: ");
            rendaFamiliar = scan.nextDouble();
            System.out.println("Digite o número de moradores: ");
            numeroDeMoradores = scan.nextInt();
            System.out.println("Digite seu gasto com Luz: ");
            gastoComLuz = scan.nextDouble();
            System.out.println("Digite seu gasto com Agua: ");
            gastoComAgua = scan.nextDouble();
            System.out.println("Digite seu gasto com Internet: ");
            gastoComInternet = scan.nextDouble();
            System.out.println("Digite o valor da mensalidade da academia: ");
            valorMensalidadeDaAcademia = scan.nextDouble();
            // atribuindo valores ao objeto
            df.rendaFamiliar = rendaFamiliar;
            df.numeroDeMoradores = numeroDeMoradores;
            df.gastoComLuz = gastoComLuz;
            df.gastoComAgua = gastoComAgua;
            df.gastoComInternet = gastoComInternet;
            df.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;
            // resultado
            System.out.printf("Renda Familia: %.3f \nTotal de gastos com despesas: %.3f \nRenda Familiar Líquida: %.3f", df.rendaFamiliar, df.calcularTotalDeDespesas(), df.calcularRendaFamiliarLiquida() );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
