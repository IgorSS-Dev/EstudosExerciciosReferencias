package academy.javacore.introducaometodos.test;

import academy.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora3 = new Calculadora();
        double resultado = calculadora3.divideDoisNumeros(66, 0);
        System.out.println(resultado);
        System.out.println(calculadora3.divideDoisNumeros02(20, 0));
        calculadora3.imprimeDivisaoDeDoisNumeros(99, 0);
    }
}
