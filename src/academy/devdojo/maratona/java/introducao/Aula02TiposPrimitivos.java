package academy.devdojo.maratona.java.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //tipos que vão guardar em memória um valor simples
        //int, double, float, char. byte, short, long, boolean
        //eles possuem tamanhos de bits que conseguem alocar em memória. Ex.: int e long são para inteiros, variando o tamanho
        //numeros inteiros:
        // byte => 8 bits => -128 a 127
        // short => 16 bits => -32.768 a 32.767
        // int => 64 bits => -9.223.372.036.854.775.808  a 9.223.372.036.854.775.808
        // numeros decimais
        //float => 32 bits => precisão simples (2 números após a virgula)
        //double => 64 bits => precisão dupla
        int idade = 40;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean possuiHabilitacao = true;
        char sexo = 'M';

        System.out.println("A idade é:"+idade);
        System.out.println("É habilitado?"+possuiHabilitacao);

        //cast - é o processo de converter um tipo de dado para outro tipo compatível.
        // Pode ser usado tanto para tipos primitivos quanto para objetos (classes)
        float salarioFloat1 = (float) 2500.0D;

        //String não é um tipo primitivo, é uma classe, por isso se inicia com S maiúsculo
        String nome = "Aldemir josé clodoaldo guimaraes silva";
        System.out.println(nome);

    }
}
