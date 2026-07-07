package academy.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // --- Exemplos de tipos de arrys references e dados
        // byte, short, int, long, float, e double 0
        // char '\0000' ' '
        // boolean false
        // String null
        String[] nomes = new String[4];
        nomes[0] = "Leoty";
        nomes[1] = "Artorias";
        nomes[2] = "Blade";
        nomes[3] = "Gandalf";

        for (int i = 0; i < nomes.length; i++) {
            // Quando trabalhamos com Arrays, podemos usar a referência .length
            System.out.println(nomes[i]);
        }

        nomes = new String[5];
        // Nesse caso, o array irá sobrepor o seu anterior com a mesma nomeclatura/referência
        nomes[0] = "Zezinho";
        nomes[1] = "Joãozinho";
        nomes[2] = "Klebinho";
        nomes[3] = "Robertinho";
        nomes[4] = "Fabinho";

        // Irá "apagar" os valores do array anterior

    }
}
