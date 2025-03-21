package br.com.fiap;

import java.util.Scanner;

public class Ex03Scanner {
    public static void main(String[] args) {
        float raio;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Qual o raio do cículo?");
            raio = scan.nextFloat();
            double area = 3.14*(raio*raio);
            System.out.println("A area é: " + area);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
