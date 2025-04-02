// Pietro Abrahamian RM: 561469, Gabriel Martins RM: 562194, Orlando Gonçalves RM: 561584
package br.com.fiap.bean;

public class DespesaFamiliar {
    // atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;
    // métodos
    public double calcularTotalDeDespesas(){
        return gastoComAgua + gastoComInternet + gastoComLuz + (valorMensalidadeDaAcademia * numeroDeMoradores);
    }
    public double calcularRendaFamiliarLiquida(){
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}
