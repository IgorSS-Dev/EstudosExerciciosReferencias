package academy.introducao;

public class Aula04 {
    public static void main(String[] args) {
        int idade = 21;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida) {
            System.out.printf("Autorizado a comprar bebida alcólica ");

        }
        if (!isAutorizadoComprarBebida) {
            // Exemplo usando um operador de negação
            System.out.printf("Não autorizado a comprar bebida alcólica");
        }
    }
}
