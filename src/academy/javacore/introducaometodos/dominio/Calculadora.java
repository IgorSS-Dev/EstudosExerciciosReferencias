package academy.javacore.introducaometodos.dominio;

public class Calculadora {
    // Declaração de metodo
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void somaSubtraiNumeros() {
        System.out.println(21 - 2);
    }

    // Exemplo de parâmetro
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    //Exemplo de metodo com retorno
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // Exemplo de uso diferente de retur
    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

    // Exemplo de return com metodo void
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            // Nesse caso, utilizei uma mensagem na condicional, pois o comando "return" não é válido para metodo void
        } else {
            System.out.println(num1 / num2);
        }
    }
}
