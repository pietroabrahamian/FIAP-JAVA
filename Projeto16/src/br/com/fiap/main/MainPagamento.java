package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String nome;
        float valorHoraTrabalho, adicionalNoturno, comissao, salario;
        long CNPJ;
        int opcao;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de funcionário você gostaria de calcular o salário? \n(1) Vigia Noturno \n(2) Vendedor \n(3) Freelancer"));
                nome = JOptionPane.showInputDialog("Digite o seu nome: ");
                valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da sua hora de trabalho: "));
                switch (opcao) {
                    case 1:
                        adicionalNoturno = Float.parseFloat("Qual o valor do seu add noturno?");
                        VigiaNoturno vn = new VigiaNoturno(nome, valorHoraTrabalho, adicionalNoturno);
                        salario = vn.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Certo, sr(a). %s seu sal[ario é de: %.2f", vn.getNome(), salario), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        comissao = Float.parseFloat(JOptionPane.showInputDialog("Qual a porcetagem da comissão?"));
                        Vendedor vend = new Vendedor(nome, valorHoraTrabalho, comissao);
                        salario = vend.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Exibindo os dados: \nNome: %s \nSalário: R$ %.2f", vend.getNome(), salario));
                        break;
                    case 3:
                        Freelancer freela = new Freelancer(nome, valorHoraTrabalho, 0);
                        salario = freela.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Exibindo os dados: \nNome: %s \nSalário: R$ %.2f", freela.getNome(), salario));;
                        break;
                    default:
                        throw new Exception("Escolha errada");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ATENLÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
