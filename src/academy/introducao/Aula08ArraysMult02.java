package academy.introducao;

public class Aula08ArraysMult02 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        // Exemplo de inicialização por referência
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};
        // Exemplo de inicialização definindo valorentes diretamente

        // Os arrays podem ter seus valores definidos posteriormente caso seja multidimêncionais


        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4}};
        // Exemplo de inicialização direta

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }

}
