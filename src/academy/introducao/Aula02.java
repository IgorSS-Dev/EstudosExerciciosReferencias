package academy.introducao;

public class Aula02 {
    public static void main(String[] args) {
        // tipos de dados: int, float, char, byte, short, long, boolean
        int idade = 10;
        // É possível forçar que um int possua um long dentro dele
        int idade1 = (int) 100000000000L;
        long numeroGrand = 100000L;
        // O mesmo vale para um float dentro de um double
        // exemplo de casting:
        double salarioDouble = (float) 2000.0D;
        // porém, não é uma prática recomendada
        float salarioFloat = 250.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        System.out.println("A idade do pacinete X é " +idade);
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(salarioFloat);
        System.out.println(idade1);
        System.out.println("---------------------------------------------------------------");



    }
}
