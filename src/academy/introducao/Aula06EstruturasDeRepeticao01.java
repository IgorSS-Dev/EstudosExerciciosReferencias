package academy.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int contador = 12;

        // 1. Exemplo com while (enquanto)
        while(contador < 11) {
            System.out.println(++contador);
            // contador = contador + 1;
            // contador += 1;
        }
        int count = 0;
        // 2. do while
        do {
            System.out.println("Dentro do do-while "+ ++count);
        } while (count < 10);
        // 3. for
        int cont = 0;
        for(int i=0; i <10; i++) {
            System.out.println("For "+i);
        }
    }
}
