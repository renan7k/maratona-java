package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000

        //A solução abaixo NÃO é a melhor, pois se o i iniciar com 1, vai imprimir apenas números ímpares
        //int i = 0;
        //while(i <= 100){
        //    System.out.println(i);
        //    i+=2;
        //}

        //usando for, e verificando se o número é par antes de imprir
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
