package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(23 - 11);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    //metodo de divisao sem retorno, apenas printando
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero.");
            return;  //neste caso, funciona como um break;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 68;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
    //varArgs
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }
    /// DESAFIO: Criar uma calculadora que valida se o número é primo ou não.| Retornar true se for, false se não
    public boolean numeroPrimo( int numero){
        if(numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero) ; i++) {
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    //DESAFIO2: Criar uma calculadora que receba uma lista/array, e retorne toda essa lista * 2
    public void arrayX2 (int[] numeros ){
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] *= 2;
            System.out.println(numeros[i]);
        }
    }
}
