package academy.introducao;

public class Aula04 {
    public static void main(String[] args) {

        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        // Exemplo usando um operador ternário
        String resultado = salario > 5000  ? mensagemDoar : mensagemNaoDoar;
        // Deve ser usado quando em situações de condicionais simples
        System.out.println(resultado);
    }
}
