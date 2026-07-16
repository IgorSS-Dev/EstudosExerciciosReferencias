package academy.javacore.introducaoclasses.test;


import academy.javacore.introducaoclasses.dominio.Estudante;
// Sempre que se utiliza outra classe / objeto como refência, é nessecário fazer o import
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        // Aqui estou declarando uma variável de referência do objeto estudante
        estudante.nome = "Darius";
        estudante.idade = 23;
        estudante.sexo = 'M';
        // Aqui eu acesso os atributos do objeto usando a variável de referência e defino seus valores

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
