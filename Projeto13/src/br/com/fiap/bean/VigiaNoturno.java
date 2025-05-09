package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario {
    // atributos
    private float adicionalNoturno;

    // construtores
    public VigiaNoturno() {
    }

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        super(nome, valorHoraTrabalho);
        this.adicionalNoturno = adicionalNoturno;
    }

    // set e get
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    // metodos particulares
    public float calcularSalario() {
        return ((super.getValorHoraTrabalho() * 40 * 4) + adicionalNoturno);
    }
}
