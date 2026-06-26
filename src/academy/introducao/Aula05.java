package academy.introducao;

// Estruturas condicionais - Switch


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Aula05 {
    public static void main(String[] args) {
        // Problema: Imprima o dia da semana, considerando 1 como domingo.
        byte dia = 1;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                // default pode ser aplicado em qualquer parte de um switch case
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Mulher");
                break;
            case 'H':
                System.out.println("Homem");
                break;
                // Existe a opção de usar chaves {} em uma case, caso necessário
            default:
                System.out.println("Inválido");
        }
    }
}
