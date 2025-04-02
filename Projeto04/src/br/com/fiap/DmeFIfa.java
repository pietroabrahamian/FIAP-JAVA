package br.com.fiap;

public class DmeFIfa {
    public int numeroDeJogadores;
    public String nomeDme;
    public int vezes;

    public void aumentarNumeroDeJogador(){
        numeroDeJogadores++;
    }
    public void diminuirNumeroDeJogador(){
        numeroDeJogadores--;
    }
    public void alterarDme(String novoNomeDme){
        nomeDme = novoNomeDme;
    }
    public void quantasVezes(int quantidade){
        vezes = quantidade;
    }


}
