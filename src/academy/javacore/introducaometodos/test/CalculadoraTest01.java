package academy.javacore.introducaometodos.test;

import academy.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        // Exemplo de ativação de metodo
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.somaSubtraiNumeros();

    }
}
