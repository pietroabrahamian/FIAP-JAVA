package br.com.fiap.bean;

public class Vendedor extends Funcionario{
    // atributos
    private float comissao;

    // construtores
    public Vendedor(){}
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        super(nome, valorHoraTrabalho);
        this.comissao = comissao;
    }

    //set e get
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    // metodos particulares
    public float calcularSalario() {
        return (((super.getValorHoraTrabalho() * 40) * 4) * (1 + comissao/100)) ;
    }
}
