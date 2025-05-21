package br.com.fiap.bean;

/** Classe para objetos do tipo de fundionário Vendedor
 * essa classe implementa a interface Funcionario
 * @author Pietro Abrahamian
 * @version 1.0
 */

public class Vendedor implements Funcionario{
    // atributos
    String nome;
    float valorHoraTrabalho, comissao;

    // construtores
    public Vendedor() {
    }
    public Vendedor(String nome, Float valorHoraTrabalho, Float comissao) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.comissao = comissao;
    }

    // set e get
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(Float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public Float getComissao() {
        return comissao;
    }
    public void setComissao(Float comissao) {
        this.comissao = comissao;
    }

    // metodos particulares
    /**Método para calcular o salário.
     *  Utiliza o atributo valorHoraTrabalho, multiplica pela quantidade de hora semanal e pela semana do mês, dps multiplica tudo isso pela comição/100.
     * @return float - valor do salário
     */
    public float calcularSalario() {
        return (((valorHoraTrabalho * 40) * 4) * (1 + comissao/100));
    }
}
