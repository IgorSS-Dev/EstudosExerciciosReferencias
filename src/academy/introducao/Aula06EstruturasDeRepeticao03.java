package academy.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000 (ex: se 40000 = 40 parcelas de 40 mil)

        double valorTotal = 50000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela+ " R$"+valorParcela);
        }

    }
}
