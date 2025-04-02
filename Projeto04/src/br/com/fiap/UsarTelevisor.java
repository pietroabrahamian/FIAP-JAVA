package br.com.fiap;

public class UsarTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.volume = 5;
        televisor.canal = 501;

        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.diminuirVolume();
        televisor.trocarCanal(509);
        televisor.trocarCanal(601);
        System.out.println("O Volume atual é: " + televisor.volume + "\nO canal atual é: " + televisor.canal);
    }
}
