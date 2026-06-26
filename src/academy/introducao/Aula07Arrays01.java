package academy.introducao;

import java.sql.SQLOutput;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int idade01 = 15;
        int idade02 = 20;
        int idade03 = 21;
        // Exemplo de má utilização de alocação de memória

        int [] idades = new int[3];
        // Define-se o índice do Array
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 20;
        // Posteriormente os valores agregados a cada posição
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

    }
}
