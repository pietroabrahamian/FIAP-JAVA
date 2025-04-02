package br.com.fiap;

public class Televisor {
    // atributos
    public int volume;
    public int canal;

    //metodos
    public void aumentarVolume(){
        volume++;
    }
    public void  diminuirVolume(){
        volume--;
    }
    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }

}
