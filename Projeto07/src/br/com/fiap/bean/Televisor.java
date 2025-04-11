package br.com.fiap.bean;

public class Televisor {
    // atributos
    private int volume, canal;

    // metodos set/get

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13 ) {
                this.canal = canal;
            } else {
                System.out.println("Insira um canal válido (2, 4, 5, 7 ou 13");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        try {
            if (volume >=0 && volume <=20) {
                this.volume = volume;
            } else {
                System.out.println("O valor inserido não está de acordo com os padrões (min = 0 e max = 20");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    // metoods da classe (particulares)
    public void aumentarVolume () {
        volume++;
    }
    public void diminuirVolume () {
        volume--;
    }
}
