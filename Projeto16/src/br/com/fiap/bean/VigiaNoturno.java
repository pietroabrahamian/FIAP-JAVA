package br.com.fiap.bean;

/** Classe para objetos do tipo de fundionário Vigia Noturno
 * essa classe implementa a interface Funcionario
 * @author Pietro Abrahamian
 * @version 1.0
 */

public class VigiaNoturno implements Funcionario{
    // atributos
    String nome;
    float valorHoraTrabalho, adicionalNoturno;

    // construtores
    public VigiaNoturno() {
    }
    public VigiaNoturno(String nome, Float valorHoraTrabalho, Float adicionalNoturno) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.adicionalNoturno = adicionalNoturno;
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
    public Float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(Float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    // metodos particulares

    /**Método para calcular o salário.
     * Utiliza o atributo valorHoraTrabalho, multiplica pela quantidade de hora semanal e pela semana do mês, somando com a o adicionalNoturno.
     * @return float - valor do salário
     */
    public float calcularSalario() {
        return ((valorHoraTrabalho * 40) * 4 + adicionalNoturno);
    }
}
