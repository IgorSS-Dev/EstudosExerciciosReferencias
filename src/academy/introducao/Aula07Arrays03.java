package academy.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        // Forma tradicional de se declarar um array
        int[] numeros2 = {1, 2, 3, 4, 5};
        // Declarando um array direatamente com os valores e tamanho do array

        int[] numeros3 = new int[] {5, 4, 3, 2, 1};
        // Outro exemplo de inicializar/declarar um array já com os valores

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int num: numeros3) {
            System.out.println(num);
        }
        // Exemplo com o foreach
        // Embora seja simples, ele não tem índice

        // Não é necessário se preoculpar com o tamanho do array pois num é uma variável local de referência
    }
}
