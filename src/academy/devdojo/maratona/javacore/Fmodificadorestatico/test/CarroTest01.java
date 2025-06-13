package academy.devdojo.maratona.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratona.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180); // Com isso, TODAS as intâncias de carro, vão ter a vel. Limite = 180
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 290);
        Carro c3 = new Carro("Mercedes", 310);
        // A velocidade limite ser alterada é um problema, e mesmo q o metodo tivesse private, ainda nn seria o ideal no java
        //Para isso, o ideal é criar com modificador estático (classe carro)
        //c1.setVelocidadeLimite(180);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
