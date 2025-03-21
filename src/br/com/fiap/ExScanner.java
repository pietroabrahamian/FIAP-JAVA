package br.com.fiap;

import java.util.Scanner;

public class ExScanner {
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.print("Qual a sua nota na primeira prova? ");
            p1 = scan.nextFloat();
            System.out.print("Qual a sua nota na segunda prova? ");
            p2 = scan.nextFloat();
            System.out.print("Qual a sua nota na terceira prova? ");
            p3 = scan.nextFloat();
            System.out.print("Qual a sua nota na quarta prova? ");
            p4 = scan.nextFloat();
            media = (p1+p2+p3+p4)/4;
            System.out.println("A sua média final foi: " + media);
        } catch (Exception e) {
            System.out.println("Sua nota é inválida! Por favor inserir uma nota entre 0 e 10.");
        }
    }
}