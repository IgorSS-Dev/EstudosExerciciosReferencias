package academy.introducao;

public class Aula03 {
    public static void main(String[] args) {

        // Operadores lógicos
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        // Resto de divisão
        int resto = 21 % 7;
        System.out.println(resto);

        //  < > <= >= !=
        // Maior, menor, maior igual, menor igual, diferente

        // Ex:
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);
        System.out.println("isDezDiferenteDez " +isDezDiferenteDez);


        // Operadores lógios
        // AND (&&) = Comparação

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLei = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLei " +isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        //OR (||) = Ou uma coisa ou outra (ao menos 1 verdadeiro)

        //Not (!) = Negação



    }
}
