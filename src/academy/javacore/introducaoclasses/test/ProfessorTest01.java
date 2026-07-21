package academy.javacore.introducaoclasses.test;

import academy.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Professor Lih";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " Idade: " + professor.idade + " Sexo: "+ professor.sexo);
        // Exemplo de impressão na mesma linha usando todas as variáveis de referência

    }
}
