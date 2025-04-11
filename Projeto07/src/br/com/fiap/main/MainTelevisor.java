package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.setCanal(4);
        tv.setVolume(15);

        int simOuNao;

        Scanner scan;

        // interação com o usuário
        scan = new Scanner(System.in);
        System.out.printf("Bom dia! Sua Tv está conectada ao canal %d e com o colume %d", tv.getCanal(), tv.getVolume());
        System.out.println("\nQuer definir outro canal? \n(1 = sim / 2 = não)");
        simOuNao = scan.nextInt();
        if (simOuNao == 1){
            System.out.println("Escolha um canal:");
            tv.setCanal(scan.nextInt());
        }
        System.out.println("Quer definir outro volume? \n(1 = sim / 2 = não)");
        simOuNao = scan.nextInt();
        if (simOuNao == 1){
            System.out.println("Defina um volume:");
            tv.setVolume(scan.nextInt());
        }
        System.out.println("Deseja aumentar o volume? \n(1 = sim / 2 = não)");
        simOuNao = scan.nextInt();
        if (simOuNao == 1){
            tv.aumentarVolume();
        }
        System.out.println("Deseja diminuir o volume? \n(1 = sim / 2 = não)");
        simOuNao = scan.nextInt();
        if (simOuNao == 1){
            tv.diminuirVolume();
        }
        System.out.printf("Agora sua Tv está conectada ao canal %d e com o colume %d", tv.getCanal(), tv.getVolume());

    }

}
