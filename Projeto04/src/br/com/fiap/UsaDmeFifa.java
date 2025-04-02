package br.com.fiap;

public class UsaDmeFifa {
    public static void main(String[] args) {
        DmeFIfa dmefifa = new DmeFIfa();
        dmefifa.vezes = 1;
        dmefifa.nomeDme = "Diária Bronze";
        dmefifa.numeroDeJogadores = 11;

        dmefifa.quantasVezes(3);
        dmefifa.aumentarNumeroDeJogador();
        dmefifa.diminuirNumeroDeJogador();
        dmefifa.diminuirNumeroDeJogador();
        dmefifa.diminuirNumeroDeJogador();
        dmefifa.alterarDme("Diária Ouro");
        System.out.println("Qual o DME que deve ser feito? " + dmefifa.nomeDme + "\nQuantas vezes eu posso fazer ele? " + dmefifa.vezes + "\nQuantos jogadores são necessários? " + dmefifa.numeroDeJogadores);
    }
}
