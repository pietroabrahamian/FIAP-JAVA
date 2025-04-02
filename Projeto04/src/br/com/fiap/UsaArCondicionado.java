package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado arcondicionado = new ArCondicionado();

        arcondicionado.temperatura = 21;
        arcondicionado.modo = "resfriar";

        arcondicionado.aumentarTemperatura();
        arcondicionado.diminuirTemperatura();
        arcondicionado.aumentarTemperatura();
        arcondicionado.trocarModo("ventilar");
        System.out.println("A temperatura atual é: " + arcondicionado.temperatura + "\nO modo atual é: " + arcondicionado.modo);
    }
}
