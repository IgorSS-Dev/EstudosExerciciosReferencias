package lista.exercicios;

public class Exercicio001 {
    public static void main(String[] args) {
        String nome = "Igor", endereco = "Salvador, BA", dataRecebimentoSalario = "01/12/2025";
        double salario = 1877.23;

        System.out.println("Eu <" + nome + ">, morando no endereço <" + endereco + ">,");
        System.out.println("confirmo que recebi o salário de <" + salario + ">, na data <" + dataRecebimentoSalario + ">");

        // Talvez uma forma mais prática:
        String relatorio ="Eu <" + nome + ">, morando no endereço <" + endereco + ">, confirmo que recebi o salário de <" + salario + ">, na data <" + dataRecebimentoSalario + ">";
        System.out.println(relatorio);
    }
}
