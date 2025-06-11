package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corolla";
        carro1.ano = 2018;
        carro1.modelo = "XTZ premium";

        carro2.nome = "Creta";
        carro2.ano = 2023;
        carro2.modelo = "Basic";

        System.out.println(carro1.nome + " " + carro1.ano + " " + carro1.modelo);
        System.out.println(carro2.nome + " " + carro2.ano + " " + carro2.modelo);

        //Referência de objetos - Apontar carro3 para o mesmo endereço de memória que o carro1
        Carro carro3 = new Carro();
        carro3 = carro1;
        System.out.println(carro3.nome + " " + carro3.ano + " " + carro3.modelo);
    }
}
