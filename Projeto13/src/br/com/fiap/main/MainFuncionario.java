package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import javax.swing.*;

public class MainFuncionario {
    public static void main(String[] args) {
        String auxiliar, nome, escolha = "sim";
        float valorHoraTrabalho, adicionalNoturno, comissao, salario;
        int opcao;

        while (escolha.equalsIgnoreCase("sim"){
            try{
                auxiliar = JOptionPane.showInputDialog("Qual o seu tipo de contrato? \n(1) Funcionário \n(2) Vigia Noturno \n(3) Vendedor");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao){
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o seu valor hora: ");
                        valorHoraTrabalho = Float.parseFloat(auxiliar);
                        Funcionario func = new Funcionario(valorHoraTrabalho);
                        salario = func.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Seu salário é: %.2f", salario));
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            escolha = JOptionPane.showInputDialog("Deseja continuar?");
        }


    }
}
