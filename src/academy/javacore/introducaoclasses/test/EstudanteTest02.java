package academy.javacore.introducaoclasses.test;

import academy.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        //  new Estudante();
        // Exemplo de como criar um objeto sem variável de referência
       Estudante estudante =  new Estudante();
       // Exemplo com a variável de referência
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        // O valores serão a referência na memória
    }
}
