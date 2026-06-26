package academy.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima os primeiro 25 número de um dado valor. Por exemplo, 50

        int valorMax = 50;
        for (int i = 0; i <valorMax ; i++) {
            if(i>25) {
                break;
            } //break pode ser usado somente em switchs e laços de repetição.
            System.out.println(i);
        }

    }
}
