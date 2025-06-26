package academy.devdojo.maratona.javacore.Qstring.test;
//String no java são imutáveis
//sempre que for comparar strings usar o equals(para validar o valor)
//Se quiser comparar a referência, aí sim usa o ==
public class StringTest01 {
    public static void main(String[] args) {
        String nome = "José";  //String constant pool
        String nome2 = "José";
        System.out.println(nome == nome2);

        //Aqui percebemos q mesmo concatenando, o valor da String ainda é apenas josé, por ser imutável
        nome.concat("lison");
        System.out.println(nome == nome2); // == comparando variável de referência, nn valor
        System.out.println(nome);

        //O que acontece na linha abaixo é q, a variável nome vai fazer referência a uma nova variável no String pool
        //nn é como se tivéssemos alterando o espaço "José"
        nome = nome.concat("lison"); //nome += "lison"
        System.out.println(nome);

        //Da forma abaixo, estamos criando uma variável de referência a um OBJETO, que é criado em outro lugar (NÃO no string pool)
        String nome3 = new String("José"); //bem pouco utilizado
        System.out.println(nome2 == nome3); // aqui dá false, pq fazem referênciaa a lugares diferentes na memória (objeto vs string pool)
        System.out.println(nome2 == nome3.intern());
    }
}
