package br.com.fiap.bean;

public class ArCondicionado {
    // atributos
    private int temperatura;
    private String modo;

    // set/get

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        try{
            if (modo.equalsIgnoreCase("ventilar") || modo.equalsIgnoreCase("aquecer") || modo.equalsIgnoreCase("resfriar")){
                this.modo = modo;
            } else {
                System.out.println("Modo inserido é inváido. Por favor escolher entre: Ventilar, Aquecer e Resfirar.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    // métodos
    public void aumentarTemperatura(){
        if (temperatura >= 15 && temperatura < 26) {
            temperatura++;
        } else {
            System.out.println("A temperatura já está em seu limite. (min = 15 e max = 26");
        }
    }
    public void diminuirTemperatura(){
        if (temperatura > 15 && temperatura <= 26) {
            temperatura--;
        } else {
            System.out.println("A temperatura já está em seu limite. (min = 15 e max = 26");
        }
        temperatura--;
    }
}
