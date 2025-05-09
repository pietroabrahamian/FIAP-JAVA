package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        float lado, altura, area;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")) {
            try{
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular? \n(1) Quadrado \n(2) Retângulo \n(3) Trângulo");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        Quadrado quadrado = new Quadrado(lado);
                        area = quadrado.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do Quadrado: %.2f", area));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        altura = Float.parseFloat(auxiliar);
                        Retangulo retangulo = new Retangulo(lado, altura);
                        area = retangulo.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do Retângulo: %.2f", area));
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        altura = Float.parseFloat(auxiliar);
                        Triangulo triangulo = new Triangulo(lado, altura);
                        area = triangulo.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do Triângulo: %.2f", area));
                        break;
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre");
    }
}
