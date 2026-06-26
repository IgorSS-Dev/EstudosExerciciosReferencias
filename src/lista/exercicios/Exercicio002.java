package lista.exercicios;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o dia da semana?");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda-Feira - Dia útil");
                break;
            case 3:
                System.out.println("Terça-Feira - Dia útil");
                break;
            case 4:
                System.out.println("Quarta-Feira - Dia útil");
                break;
            case 5:
                System.out.println("Quinta-Feira - Dia útil");
                break;
            case 6:
                System.out.println("Sexta-Feira - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Fim de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
