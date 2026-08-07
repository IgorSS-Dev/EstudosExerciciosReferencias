package academy.javacore.introducaometodos.test;

import academy.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        // Exemplo de parâmetros
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num 1: " +num1);
        System.out.println("Num 2: " +num2);

        // Nota-se que os valores não são substituídos ou sobrepostos
        // Ao passar variáveis primitivos para um metodo é criado uma cópia

    }
}
