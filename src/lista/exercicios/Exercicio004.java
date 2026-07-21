package lista.exercicios;

import academy.javacore.introducaoclasses.dominio.Carro;

public class Exercicio004 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Volkswagen Fusca";
        carro1.modelo = "Itamar 96";
        carro1.ano = 1996;
        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);

        System.out.println("---------------------------------------");

        Carro carro2 = new Carro();
        carro2.nome = "Chevrolet Astra";
        carro2.modelo = "Hatch";
        carro2.ano = 2008;
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
