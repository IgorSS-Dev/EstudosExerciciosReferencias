package academy.introducao;

public class Aula08ArraysMult01 {
    public static void main(String[] args) {
        // 1,2,3,4,5
        // 31, 28 dias

        int[][] dias = new int[3][3];
        // Exemplo de sintaxe de array multidimensional
        dias[0][0] = 28;
        dias[0][1] = 31;
        dias[0][2] = 15;

        dias[1][0] = 5;
        dias[1][1] = 8;
        dias[1][2] = 22;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

    }
}
