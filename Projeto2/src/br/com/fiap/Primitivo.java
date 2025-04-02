package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        // declaração e inicialização (opicional) de variáveis
        char sexo = 'F';
        byte idade = 39;
        short codigo = 15650;
        int alunos = 50, classes = 11; // ou int classes = 11; na linha debaixo
        long brasileiros = 2166357488L; // L trata esse núemro como um long pq por padrão é int
        float media = 8.73f; // f indicando que é um float e não um double
        double dolar = 5.69;
        boolean alternativa = false; // sem pre com letra minúscula
        String nomeCompleto = "Astrogildo Planetário Celeste";
        System.out.println("Sexo: " +  sexo + " Idade: " + idade);
        System.out.println("Código: " + codigo + " Média: " + media + " Alunos: " + alunos + " Turmas: " + classes);
        System.out.println("habitantes: " + brasileiros + " Dólar U$: " + dolar + " Alternativa: " + alternativa);
        System.out.println("Nome: " + nomeCompleto);

    }
}
