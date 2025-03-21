package br.com.fiap;

import javax.swing.*;

public class Ex01JOp {
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
        String janela;

        try {
            janela = JOptionPane.showInputDialog("Qual a sua nota na primeira prova?");
            p1 = Float.parseFloat(janela);
            janela = JOptionPane.showInputDialog("Qual a sua nota na segunda prova?");
            p2 = Float.parseFloat(janela);
            janela = JOptionPane.showInputDialog("Qual a sua nota na terceira prova?");
            p3 = Float.parseFloat(janela);
            janela = JOptionPane.showInputDialog("Qual a sua nota na quarta prova?");
            p4 = Float.parseFloat(janela);
            media = (p1+p2+p3+p4)/4;
            JOptionPane.showMessageDialog(null, "A sua média final foi: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sua nota é inválida! Por favor inserir uma nota entre 0 e 10.");
        }
    }
}
