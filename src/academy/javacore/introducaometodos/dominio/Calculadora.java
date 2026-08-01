package academy.javacore.introducaometodos.dominio;

public class Calculadora {
    // Declaração de metodo
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void somaSubtraiNumeros() {
        System.out.println(21-2);
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

}
