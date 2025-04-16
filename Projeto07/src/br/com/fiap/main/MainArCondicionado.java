package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class MainArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ac = new ArCondicionado();
        ac.setModo("ventilar");
        ac.setTemperatura(20);
        int simounao;

        Scanner scan;

        scan = new Scanner(System.in);
        System.out.printf("Olá, atualmente o seu ArCondiconado está nessas condições?: Modo: %s e Temperatura: %d \nDeseja alterar? \n1. Sim \n2. Não\n", ac.getModo(), ac.getTemperatura());
        simounao = scan.nextInt();
        if (simounao == 1){
            System.out.println("Em qual modo de você deseja colocar? (Ventilar, Aquecer ou Resfriar)");
            ac.setModo(scan.next());
            System.out.println("Deseja aumentar a temperatura? \n1. Sim \n2. Não\n");
            simounao = scan.nextInt();
            if (simounao == 1) {
                ac.aumentarTemperatura();
                System.out.println("Temperatura Aumentada!");
            }
            System.out.println("Deseja diminuir a temperatura? \n1. Sim \n2. Não\n");
            simounao = scan.nextInt();
            if (simounao == 1) {
                ac.diminuirTemperatura();
            }
            System.out.printf("\nVocê finalizou a alteração em seu ArCondicionado, as condições foram atualizadas para: Modo: %s e Temperatura: %d", ac.getModo(), ac.getTemperatura());
        } else if (simounao == 2) {
            System.out.println("Ok, muito obrigado!! Tenha uma ótima tarde.");
        } else {
            System.out.println("Perdão, não entendi! Poderia digitar um número válido ( 1 ou 2 )");
        }

    }
}
