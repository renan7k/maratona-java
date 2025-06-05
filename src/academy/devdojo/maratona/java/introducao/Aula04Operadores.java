package academy.devdojo.maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        //+ - / *
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero2 + numero1);
        //Java entende o + de forma diferente em cada situação
        //Na primeira saída é soma, na debaixo, estáa juntando pois é depois da String
        System.out.println("Valor é: "+numero2+numero1);

        //Divisão entre 2 números inteiros sempre será um número inteiro
        double resultado1 = numero1 / numero2;
        System.out.println(resultado1);

        double numero3 = 20;
        double resultado2 = numero1 / numero3;
        System.out.println(resultado2);
    }
}
