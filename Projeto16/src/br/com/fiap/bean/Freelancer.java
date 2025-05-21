package br.com.fiap.bean;

/** Classe para objetos do tipo de fundionário Freelancer
 * essa classe implementa a interface Funcionario
 * @author Pietro Abrahamian
 * @version 1.0
 */

public class Freelancer implements Funcionario{
    //atributos
    String nome;
    float valorHoraTrabalho;
    long CNPJ;

    //construtores
    public Freelancer(String nome) {
        this.nome = nome;
    }
    public Freelancer(String nome, float valorHoraTrabalho, long CNPJ) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.CNPJ = CNPJ;
    }

    //set e get
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public long getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    // metodos particulares
    /**Método para calcular o salário.
     *  Utiliza o atributo valorHoraTrabalho, multiplica pela quantidade de hora semanal e pela semana do mês, dps multiplica tudo isso por 1.5.
     * @return float - valor do salário
     */
    public float calcularSalario() {
        return ((valorHoraTrabalho * 40) * 4) * 1.5f;
    }
}
