package academy.devdojo.maratona.javacore.Qstring.test;

//PRINCIPAIS METODOS STRING
public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Abner"; //cada letra dessa é uma posição no array
        String numeros = "012345";
        String nomeEspaco = "  cleodete ";
        System.out.println(nome.charAt(0)); //charAt vai retornar o char baseado no índice
        System.out.println(nome.length()); //descobrir o tamanho das strings
        System.out.println(nome.replace("n","m")); //replace vai trocar todos os caracteres apontados
        System.out.println(nome.toLowerCase()); // transformar tudo em letra minúscula
        System.out.println(nome.toUpperCase()); // transformar tudo em letra maiúscula

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2)); //Recebe 2 valores: índice de onde quer  começar e índice de onde quer terminar
        //Regra: o índice q está terminando, é sempre 1 a menos do q está passando, pois ele é exclusivo (NÃO inclusivo)

        System.out.println(nomeEspaco.trim()); // trim é um metodo q vai remover os valores em branco q tem no começo e no fim
    }
}
